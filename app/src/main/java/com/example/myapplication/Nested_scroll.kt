package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.io.OutputStream
import java.net.Socket
import java.util.*
import kotlin.concurrent.schedule
import android.net.wifi.WifiManager
import android.text.format.Formatter
import android.view.View
import android.widget.*
import android.widget.Toast.LENGTH_LONG
import android.widget.Toast.LENGTH_SHORT
import androidx.core.view.get
import java.net.InetAddress



@ExperimentalStdlibApi
@Suppress("BlockingMethodInNonBlockingContext")
class Nested_scroll : AppCompatActivity() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nested_scroll)

        val img1 = findViewById<ImageView>(R.id.imageButton1)
        val img2 = findViewById<ImageView>(R.id.imageButton2)
        val img3 = findViewById<ImageView>(R.id.imageButton3)
        val img4 = findViewById<ImageView>(R.id.imageButton4)

        val img5 = findViewById<ImageView>(R.id.imageButton6)
        val img6 = findViewById<ImageView>(R.id.imageButton7)
        val img7 = findViewById<ImageView>(R.id.imageButton8)
        val img8 = findViewById<ImageView>(R.id.imageButton9)

        val order_list = mutableListOf("")

        var active: Boolean = false
        var data: String = ""

//        val wifiManager: WifiManager = applicationContext.getSystemService(WIFI_SERVICE) as WifiManager
//        val address = Formatter.formatIpAddress(wifiManager.connectionInfo.ipAddress)
//        val myIP =  InetAddress.getLocalHost()
//
        val address = "192.168.43.115"
        val port = 5050

        var spinner_val = ""
        var object_string =""

        var order_total = 0
        var total_list:MutableList<Int> = mutableListOf()

        val main_txt = findViewById<EditText>(R.id.editTextTextMultiLine)
        val order_btn = findViewById<Button>(R.id.button)
        val Clear_btn = findViewById<Button>(R.id.Clear_btn)
        val Remove_btn = findViewById<Button>(R.id.Remove_btn)
        val total = findViewById<TextView>(R.id.Total)

        val Tables= arrayOf("Table_1", "Table_2" , "Table_3", "Table_4")
        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_spinner_item,Tables)
        val spinner = this.findViewById<Spinner>(R.id.spinner_Tables)

        spinner.adapter = arrayAdapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                Toast.makeText(this@Nested_scroll, Tables[position], LENGTH_SHORT).show()
                spinner_val = Tables[position]
            }

        }

        img1.setOnClickListener {
            main_txt.append("Burger and chips   €15\n")
            order_total = order_total + 15
            total_list.add(15)
            total.setText("Total = €" + order_total.toString())
            order_list.add("Burger")
        }
        img2.setOnClickListener {
            main_txt.append("Kebab and chips    €12\n")
            order_total = order_total + 12
            total_list.add(12)
            total.setText("Total = €" + order_total.toString())
            order_list.add("Kebab")
        }
        img3.setOnClickListener {
            main_txt.append("Chips  €8\n")
            order_total = order_total + 8
            total.setText("Total = €" + order_total.toString())
            order_list.add("Chips")
        }
        img4.setOnClickListener {
            main_txt.append("Pizza  €8\n")
            order_total = order_total + 8
            total.setText("Total = €" + order_total.toString())
            order_list.add("Pizza")
        }

        img5.setOnClickListener {
            main_txt.append("Guinness\n")
            order_list.add("Guinness")
        }

        img6.setOnClickListener {
            main_txt.append("Heineken\n")
            order_list.add("Heineken")
        }

        img7.setOnClickListener {
            main_txt.append("Carlsberg\n")
            order_list.add("Carlsberg")
        }

        img8.setOnClickListener {
            main_txt.append("Rock Shore\n")
            order_list.add("Rock_Shore")
        }

        Clear_btn.setOnClickListener {
            main_txt.setText("")
            order_list.clear()
            order_total = 0
            total_list.clear()
            total.setText("Total")
        }

        Remove_btn.setOnClickListener{
            try {
                var text = main_txt.getText().toString()
                var mylist = text.split("\n")
                main_txt.setText("")
                for (x in mylist.dropLast(2)) {
                    if (x == null) {
                        break
                    } else
                        main_txt.append(x + "\n")
                }
//            main_txt.setText(mylist.dropLast(1).toString())
                total_list.removeLast()
                order_total = 0
                for (x in total_list) {
                    order_total += x
                }
                total.setText("Total = €" + order_total.toString())
            }
            catch (e: Exception){

            }
        }


        order_btn.setOnClickListener {
            try {
                CoroutineScope(IO).launch {
                    client(address, port, order_list, spinner_val)
                }
                main_txt.setText("")
                total.setText("Order Sent")
                order_total = 0
                var toast = Toast.makeText(this, "Your order has been sent", Toast.LENGTH_SHORT)
                toast.show()
            }
            catch(e: Exception){

            }
        }


    }
    private suspend fun client(address:String, port: Int, order_list: MutableList<String>,spinner_val:String){

        val connection = Socket(address, port)
        val writer = connection.getOutputStream()
        var clear = ""
        var clear_length = 0
        var send_clear_length = ""
        var object_string =""


        if(spinner_val == "Table_1") {
            clear = "Clear_Table_1"
            clear_length = clear.length
            send_clear_length = clear_length.toString()
            writer.write(send_clear_length.toByteArray())
            writer.flush()
            writer.write(clear.toByteArray())
            writer.flush()
            delay(150)
        }

        if(spinner_val == "Table_2") {
            clear = "Clear_Table_2"
            clear_length = clear.length
            send_clear_length = clear_length.toString()
            writer.write(send_clear_length.toByteArray())
            writer.flush()
            writer.write(clear.toByteArray())
            writer.flush()
            delay(150)
        }

        val spinner_length = spinner_val.length
        val send_spinner_length = spinner_length.toString()

        writer.write(send_spinner_length.toByteArray())
        writer.flush()

        writer.write(spinner_val.toByteArray())
        writer.flush()

        for(item in order_list) {

            object_string += item + " "
        }
            val my_order_length = object_string.length
            val send_length = my_order_length.toString()
            writer.write(send_length.toByteArray())
            writer.flush()
            delay(100)
            writer.write(object_string.toByteArray())
            writer.flush()

        val send_dis = "!DISCONNECT"
        val dissconect = send_dis.length
        val dissconect_mess = dissconect.toString()
        writer.write(dissconect_mess.toByteArray())
        writer.flush()
        Timer().schedule(1000){
            writer.write(send_dis.toByteArray())
            writer.flush()
        }
        order_list.clear()

    }

}


