package com.example.i_quizapp

object Constants {

    fun getQuestions(): ArrayList<Question>{
        val QuestionsList = ArrayList<Question>()

        val que1 = Question(
            1,"IN WHICH PLACE WAS THE FIRST VERSE REVEALED?",
            R.drawable.img_1,
            "MADINAH","CAVE OF SAUR",
            "CAVE OF HIRA", "TAIF MOUNTAIN",
            3
        )
        QuestionsList.add(que1)

        //2
        val que2 = Question(
            2,"HOW MANY SURAHS ARE THERE IN QURAN",
            R.drawable.img_1,
            "99","114",
            "100","115",
            2
        )
        QuestionsList.add(que2)

        //3
        val que3 = Question(
            3,"WHICH IS THE SMALLEST SURAHS IN THE QURAN?",
            R.drawable.img_1,
            "SURAH AL FATIHA","SURAH KAUTHAR",
            "SAURAH IKHLAAS","SURAH 'ASR",
            3
        )
        QuestionsList.add(que3)

        //4
        val que4 = Question(
            4,"WHAT IS THE BEST DRINK MENTIONED  IN THE QURAN",
            R.drawable.img_1,
            "WATER","HONEY",
            "ALCOHOL","MILK",
            4
        )
        QuestionsList.add(que4)

        //5
        val que5 = Question(
            5,"WHAT IS THE BEST NIGHT DESCRIBED IN THE QURAN",
            R.drawable.img_1,
            "NIGHT OF QADR","NIGHT OF BARAT",
            "NIGHT BEFORE EID","NEW YEAR NIGHT",
            1
        )
        QuestionsList.add(que5)

        //6
        val que6 = Question(
            6,"WHICH SURAH DOSEN'T START WITH BISMILLAH?",
            R.drawable.img_1,
            "SURAH ANFAL","SURAH FEEL",
            "SURAH NAML","SURAH TAWBAH",
            4
        )
        QuestionsList.add(que6)

        //7
        val que7 = Question(
            7,"WHICH BATTLE TAKE PLACE DURING THE MONTH OF MUHARRAM?",
            R.drawable.img_1,
            "BATALE OF BADR","BATTLE OF KARBALA",
            "BATTLE OF KHANDAQ","BATTLE OF UHUD",
            2
        )
        QuestionsList.add(que7)

        //8
        val que8 = Question(
            8,"WHAT EVENT OCCURS ON THE TENTH OF MUHARRAM",
            R.drawable.img_1,
            "ASHOORAH","LAYLAT AL-QADR",
            "EID MILAD UL-NABI","NONE OF THESE",
            1
        )
        QuestionsList.add(que8)

        //9
        val que9 = Question(
            9,"IMAM HUSSAIN'S MOTHER WAS: ",
            R.drawable.img_1,
            "BIBI KHADIJAH","BIBI AISHA",
            "BIBI FATIMA","BIBI ZAINAB",
            3
        )
        QuestionsList.add(que9)

        //10
        val que10 = Question(
            10,"WHAT IS TITLE OF IMAM HUSSAIN(A.S)?",
            R.drawable.img_1,
            "SAYYID AL-SHUHADA","AL- MUJTABA",
            "AL-FAROOQ","AL-SADIQ",
            1
        )
        QuestionsList.add(que10)

        return QuestionsList
    }
}