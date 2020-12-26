package com.example.myapplication

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val img1 = findViewById<ImageView>(R.id.imageButton)
        val img2 = findViewById<ImageView>(R.id. imageButton12)
        val img3 = findViewById<ImageView>(R.id. imageButton13)

        val main_txt = findViewById<EditText>(R.id.Edit_text_visit_birr)

        img1.setOnClickListener{
            main_txt.setText("Birr (/ˈbɜːr/; Irish: Biorra, meaning \"plain of water\") is a town in County Offaly, " +
                    "Ireland. Between 1620 and 1899 it was called Parsonstown, after the Parsons family who were local landowners" +
                    " and hereditary Earls of Rosse.[7] Birr is a designated Irish Heritage Town with a carefully preserved Georgian heritage. Birr" +
                    " itself has graceful wide streets and elegant buildings. Many of the houses in John's Place and Oxmantown Mall have exquisite fanlight " +
                    "windows of the Georgian period. The town is known for Birr Castle and gardens, home of the Parsons family, and also site of the Leviathan of " +
                    "Parsonstown, the largest telescope in the world for over 70 years, and a large modern radio telescope. A monastery was founded here by St Brendan of Birr. It produced the MacRegol Gospels,[11] named after the abbot at the turn of the 8th/9th century and now to be seen in the Bodleian Library in Oxford. The Synod of Birr, held in 697, was the occasion on which the Cáin Adomnáin, or law of innocents, was pronounced.\n" +
                    "\n" +
                    "In Gaelic Ireland, Birr was located in the O'Carroll territory of Éile. This petty kingdom (Irish: Tuatha) formed an area that now forms the south of County Offaly and the north-east of County Tipperary. The tuatha was subject to the overkingdom (Irish: Rí ruirech) of Munster and formed a border with the Kingdom of Meath to the east. The boundary between Ely O'Carroll and the ancient Meath is co-terminous with the present boundary between the Diocese of Killaloe and the Diocese of Meath. The O'Carroll family had a castle located at the present site of Birr Castle. Following the Plantations of Ireland, Birr was located in the Barony of Ballybritt following the formation of King's County (now County Offaly) in 1556.\n" +
                    "\n" +
                    "The town itself is an old market and former garrison town dating to the 1620s.")
        }

        img2.setOnClickListener{
            main_txt.setText("Designated Irish Heritage Town due to the preservation and wealth of Georgian " +
                    "architecture in the town.[12] The earliest Georgian style buildings dating from 1740s are located in Emmet Square " +
                    "and Emmet street (then known as Cumberland Square and Cumberland Street).[13] The column in the centre of the square dates" +
                    " from 1747 and was built to carry the statue of the Duke of Cumberland, known as the Bloody Duke and the victor of the Battle of Culloden. " +
                    "The statue was removed in 1915 as it was in danger of collapse. The Oxmantown Mall was laid out in the early 19th century and was designed as a " +
                    "promenade leading from Birr Castle gates to the Church of Ireland. The mall is tree lined on one side with the Georgian houses on the other.[13] " +
                    "John's Mall was also built during this time also with fine Georgian buildings.[13] The area is also known as the chains due to the sturdy chain " +
                    "railings enclosing the central plots in the centre of the Mall. Birr Town Council meets here in a building known as John's Hall built in the style of " +
                    "a Greek Temple.[13]")
        }

        img3.setOnClickListener{
            main_txt.setText("The Seffin Stone is said to mark the centre of Ireland.[13] Mentioned by Geraldus Cambrensis, " +
                    "who referred to it as Umbilicus Hiberniae, the indentations on the stone are as old as megalithic sites, " +
                    "such as Newgrange. Myths claim that the indentations are from the hand of Finn MacCool, hence the origin of the name as " +
                    "Suigh Finn (pronounced \"See-Finn\"), the Seat of Finn. It is located to the left of the gates to St John's Hall, on John's Mall, " +
                    "close to Emmet Square.\n" +
                    "\n" +
                    "In Emmet Square stands Dooly's Hotel: one of the oldest coaching inns in Ireland, dating from 1747. " +
                    "The name of Galway Blazers was given to the Galway Hunt after a celebration held in the hotel in 1809 resulted in the " +
                    "premises being set on fire. Film director John Huston was latterly a member of the Galway Blazers. Australian soprano Dame " +
                    "Nellie Melba famously sang to crowds gathered below in the Square, from her hotel room above in Dooly's Hotel. The nightclub attached" +
                    " to the hotel is named \"Melba's\" to mark the occasion.")
        }

    }
}