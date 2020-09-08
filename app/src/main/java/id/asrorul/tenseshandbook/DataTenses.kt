package id.asrorul.tenseshandbook


object DataTenses {
    private val tenses = arrayOf(
        "Simple Present Tense",
        "Simple Past Tense",
        "Simple Future Tense",
        "Simple Past Future Tense",
        "Present Continuous Tense",
        "Past Continuous Tense",
        "Future Continuous Tense",
        "Past Future Continuous Tense",
        "Present Perfect Tense",
        "Past Perfect Tense",
        "Future Perfect Tense",
        "Past Future Perfect Tense",
        "Present Perfect Continuous Tense",
        "Past Perfect Continuous Tense",
        "Future Perfect Continuous Tense",
        "Past Future Perfect Tense"
    )

    private val tentang = arrayOf(
        "Simple Present Tense adalah bentuk kalimat yang paling umum dalam bahasa Inggris. Kalimat simple present tidak terikat waktu, sehingga penggunaannya lebih bebas dibanding jenis tenses lainnya",
        "Simple past tense sama sederhananya dengan simple present, akan tetapi simple past tense sudah terikat dengan waktu lampau. Saat kamu bicara menggunakan simple past tense, itu berarti peristiwa yang kamu ceritakan sudah terjadi di masa lalu.",
        "Simple future tense adalah bentuk tenses yang bisa kamu pakai buat menjelaskan hal yang akan terjadi di masa depan",
        "Nah, simple past future tense adalah bagian pertama dari rangkaian empat bentuk “future in the past”. FYI, yang dimaksud future in the past adalah kejadian yang seharusnya terjadi, tapi tidak atau belum terjadi. Simple past future tense bisa kamu pakai untuk menjelaskan sesuatu yang seharusnya terjadi, seandainya ada faktor lain yang tidak berubah",
        "Continuous tense adalah jenis kalimat yang digunakan untuk menerangkan sesuatu yang sedang dalam proses dilakukan. Oleh karena “proses” yang masih berjalan tersebut, continuous tense disebut juga progressive tense.Sementara itu, present continuous tense adalah bentuk kalimat yang bisa kamu gunakan untuk menjelaskan sesuatu yang sedang dalam proses dilakukan",
        "Dengan memakai past continuous tense, kamu bisa menerangkan sesuatu yang terjadi di masa lalu. Misalnya begini nih, kemarin saudaramu menelpon saat kamu sedang makan. Kalau dibahasa-Inggriskan, kalimat tersebut bisa menjadi “You were eating when your brother called yesterday",
        "Singkatnya, future continuous tense adalah bentuk tenses yang bisa dipakai untuk mengekspresikan peristiwa yang akan dalam proses di masa depan.",
        "Past future continuous tense adalah bentuk kalimat kedua dalam seri “future in the past” setelah simple past future tense. Past future continuous biasanya digunakan untuk mengekspresikan sesuatu yang mungkin sedang terjadi di masa lalu seandainya terjadi sesuatu yang lain.\n",
        "Present perfect tense adalah kalimat yang bisa kamu pakai untuk menjelaskan sesuatu yang sudah terjadi di masa sekarang. Jika past tense digunakan hanya untuk menjelaskan bahwa sebuah peristiwa terjadi di masa lalu, perfect tense digunakan untuk menegaskan sebuah peristiwa benar-benar sudah terjadi di masa lalu.\n",
        "Past perfect tense biasa digunakan untuk menegaskan sesuatu sudah terjadi, tapi di masa lalu. Bentuk kalimat ini bisa kamu gunakan saat seseorang meminta kepastian tentang sesuatu yang sudah kamu lakukan di masa lalu.\n",
        "Future perfect tense bisa kamu gunakan untuk menerangkan sesuatu yang akan sudah kamu selesaikan di masa depan. Misalnya kamu ditanyai apakah tugasmu sudah selesai besok, kamu bisa menjawab pertanyaan tersebut dalam bentuk future perfect tense.\n",
        "Dengan menggunakan kalimat bentuk ini, kamu bisa menyatakan sesuatu yang benar-benar akan terjadi tapi tidak terjadi. Anyway, past future perfect tense adalah bentuk kalimat future in the past yang paling mutlak.\n",
        "Present perfect continuous tense biasanya digunakan untuk menerangkan sesuatu yang sudah dilakukan dan masih dilakukan hingga sekarang\n",
        "Past perfect continuous  tense adalah bentuk kalimat untuk menjelaskan sesuatu yang sudah dan masih dilakukan di masa lalu\n",
        "Ayo main contoh-contohan lagi nih buat memahami future perfect continuous tense. Misalnya kamu sedang janjian dengan temanmu untuk ke bioskop, tapi temanmu telat 30 menit. Saat ditanyai apa yang kamu lakukan, kamu bisa menjawab “aku sudah mulai menonton ﬁlm 30 menit lalu”.\n" +
                "Simpelnya, future perfect continuous bisa kamu pakai buat mengekspresikan peristiwa yang telah dan dalam proses kamu lakukan di masa depan.\n",
        "Kalimat ini mirip dengan bentuk tenses sebelumnya, yaitu future perfect continuous, tapi terjadinya di masa lalu. Past future perfect continuous tense adalah bentuk kalimat future in the past yang tertinggi, tapi to tell you the truth jarang digunakan.\n"
    )

    private val rumuspositifverbal = arrayOf(
        "Subject + V1 + (s/es)",
        "Subject + V2",
        "Subject + will + V1",
        "Subject + should/would + bare inﬁnitive",
        "Subject + is/am/are +V ing",
        "Subject + was/were +V ing",
        "Subject + will + be + V ing",
        "Subject + would + be + V ing",
        "Subject + has/have + V3",
        "Subject + had + V3",
        "Subject + will + have + V3",
        "Subject + should/would + have + V3",
        "Subject + has/have + been + V-ing+ since/for",
        "Subject + had + been + V-ing+ since/for",
        "Subject + will+ have +been + V-ing+ since/for",
        "Subject + would/should+ have +been + V-ing+ since/for"

    )

    private val katasinyal = arrayOf(
        "always, every, never, normally, often, sometimes, usually, seldom",
        "already, ever, just, never, not yet, so far, till now, up to now",
        "in a year, next …, tomorrow, next week, five days later",
        " ",
        "at the moment, just now, now, right now, Listen!, Look!",
        "when, while, as long as, at this time yesterday",
        "tomorrow morning, in one year",
        " ",
        "already, ever, just, never, not yet, so far, till now, up to now",
        "before yesterday, till three days ago, already, until that day",
        "by next Monday, in a week",
        " ",
        "for the past 5 years, how long …?, the whole week, since xxxx",
        "for, since, the whole day, all day",
        "for the last couple of hours, all day long",
        " "
    )

    private val rumuspositifnominal = arrayOf(
        "Subject + is/am/are + nominal",
        "Subject + was/were + nominal",
        "Subject + will + be + nominal",
        "Subject + was/were + going to + bare infinitive",
        "Subject + is/am/are + nominal",
        "Subject + was/were + nominal",
        "Subject + will + being + nominal",
        "Subject + would + being + nominal",
        "Subject + has/have + been + nominal",
        "Subject + had + been + nominal",
        "Subject + will + have + been + nominal",
        "Subject + should/would + have + been + nominal",
        "Subject + has/have + been + being + nominal + since/for",
        "Subject + had + been + being + nominal + since/for",
        "Subject + will + have + been + being + nominal + since/for",
        "Subject + would/should + have + been + being + nominal + since/for"
    )
    private val examplepositifverbal = arrayOf(
        "Dad works hard every day",
        "She drove to the town solely",
        "You will know sooner or later",
        "Sarah should go to the hospital",
        "She is playing a kite",
        "They were trying a new road",
        "I will be going to the school tomorrow, Nanda",
        "We would be coming to your house if you were at home",
        "I have done the task earlier",
        "Ricko had finished his homework yesterday",
        "I will have finished the cleaning in 4 hours",
        "He would’ve done the tasks if he wasn’t going to the cinema",
        "Mom has been working there since 2006",
        "I had been pushing the door for 35 minutes",
        "I will have been watching the TV since Felice come",
        "I would have been watching the TV since Felice came"
    )
    private val examplepositifnominal = arrayOf(
        "She is more beautiful than usual",
        "You were glad to meet him",
        "Henry will be the champion today",
        "He would be a writer",
        "Fajar is a college student",
        "Alea was afraid of the dark",
        "She will being a hero the day after tomorrow",
        "My son would being the actor if he wasn’t sick",
        "She has been a good doctor for the girl a while ago",
        "I had been the teacher some years ago",
        "The students will have been graduates in some months",
        "I should’ve been a soldier but I was failed",
        "She has been being a director since 2 years ago",
        "They had been being the choir since 2012",
        "She will have been being a doctor since 2016",
        "She would have been being a doctor since 2016"
    )

    private val rumusnegativverbal = arrayOf(
        "Subject + don’t/doesn’t + V1",
        "Subject + didn’t + V1",
        "Subject + won’t + V1",
        "Subject + should/would + not + bare infinitive",
        "Subject + is/am/are + not + V-ing",
        "Subject + was/were + not + V-ing",
        "Subject + will + not + be + V-ing",
        "Subject + would + not + be + V-ing",
        "Subject + has/have + not + V3",
        "Subject + had + not + V3",
        "Subject + will + not + have + V3",
        "Subject + should/would + not + have + V3",
        "Subject + has/have + not + been + V-ing +since/for",
        "Subject + had + not + been + V-ing +since/for",
        "Subject + will + not + have + been + V-ing +since/for",
        "Subject + would/should + not + have + been + V-ing + since/for"
    )
    private val rumusnegativnominal = arrayOf(
        "Subject + is/am/are + not + nominal",
        "Subject + was/were + not + nominal",
        "Subject + won’t + be + nominal",
        "Subject + was/were + not + going to + bare infinitive",
        "Subject + is/am/are + not + nominal",
        "Subject + was/were + nominal",
        "Subject + will + not + being + nominal",
        "Subject + would + not + being + nominal",
        "Subject + has/have + not + been + nominal",
        "Subject + had + not + been + nominal",
        "Subject + will + not + have + been + nominal",
        "Subject + should/would + not + have + been + nominal",
        "Subject + has/have + not + been + being + nominal + since/for",
        "Subject + had + not + been + being + nominal + since/for",
        "Subject + will + not + have + been + being + nominal + since/for",
        "Subject + would/should + not + have + been + being + nominal + since/for"
    )
    private val examplenegativverbal = arrayOf(
        "I don’t know what to say to her",
        "She didn’t drive to the town solely",
        "You won’t know till you’ve tried",
        "Sarah should not go to the hospital",
        "She is not playing a kite",
        "They weren’t trying a new road",
        "I won’t be going to the school tomorrow, Nanda",
        "We would not be coming to your house if you were at home",
        "I haven’t done the task earlier",
        "Ricko hadn’t finished his homework yesterday",
        "I won’t have finished the cleaning in 4 hours",
        "He wouldn’t have done the tasks if he wasn’t going to the cinema",
        "Mom hasn’t been working there since 2006",
        "I hadn’t been pushing the door for 35 minutes",
        "I won’t have been watching the TV since Felice come",
        "I wouldn’t have been watching the TV since Felice came"
    )
    private val examplenegativnominal = arrayOf(
        "They aren’t as bad as you think",
        "You weren’t glad to meet him",
        "She won’t be the model",
        "He wouldn’t be a writer",
        "Fajar isn’t a college student",
        "Alea wasn’t afraid of the dark",
        "She won’t being a hero the day after tomorrow",
        "My son would not being the actor if he wasn’t sick",
        "She hasn’t been a good doctor for the girl a while ago",
        "I hadn’t been the teacher some years ago",
        "The students won’t have been graduates in some months",
        "I shouldn’t have been a soldier but I was failed",
        "She hasn’t been being a director since 2 years ago",
        "They hadn’t been being the choir since 2012",
        "She won’t have been being a doctor since 2016",
        "She wouldn’t has been being a doctor since 2016"
    )

    private val rumustanyaverbal = arrayOf(
        "Do/Does + Subject + V1+?",
        "Did + Subject+ V1+?",
        "Will + Subject + V1+ ?",
        "Should/would+ Subject+ bare infinitive+ ?",
        "Is/Am?are+ Subject+ V ing+ ?",
        "Was/were + Subject+ V-ing+ ?",
        "Will + Subject + be + V-ing+ ?",
        "Would + Subject + be + V-ing+ ?",
        "Has/have + Subject + V3+?",
        "Had + Subject + V3+?",
        "Will + subject + have + V3+ ?",
        "Should/would + subject + have + V3+ ?",
        "Has/have + subject + been + V-ing+ since/for+ ?",
        "Had + subject + been + V-ing+ since/for+ ?",
        "Will + subject + have + been + V-ing + since/for?",
        "Woul/Should + subject + have + been + V-ing + since/for?"
    )
    private val rumustanyanominal = arrayOf(
        "Is/Am/Are + Subject + nominal + ?",
        "Was/were + Subject + nominal + ?",
        "Will + Subject + be + nominal + ?",
        "Was/were + subject + going to + bare infinitive + ?",
        "Is/Am/Are + Subject + nominal + ?",
        "Was/were + Subject + nominal + ?",
        "Will + Subject + being + nominal + ?",
        "Would + Subject + being + nominal + ?",
        "Has/have + Subject + been + nominal + ?",
        "Had + Subject + been + nominal + ?",
        "Will + subject + have + been + nominal + ?",
        "Should/would + subject + have + been + nominal + ?",
        "Has/have + subject + been + being + nomina + since/for?",
        "Had + subject + been + being + nomina + since/for?",
        "Will + subject + have + been + being + nominal + since/for?",
        "Would/should + subject + have + been + being + nominal + since/for?"
    )
    private val exampletanyaverbal = arrayOf(
        "Does he know about this?",
        "Did she drive to the town solely?",
        "Will the police come on time?",
        "Should Sarah go to the hospital?",
        "Is she playing a kite?",
        "Were they trying a new road?",
        "Will I be going to the school tomorrow, Nanda?",
        "Would we be coming to your house if you were at home?",
        "Have I done the task earlier?",
        "Had Ricko finished his homework yesterday?",
        "Will I have finished the cleaning in 4 hours?",
        "Would he done the tasks if he wasn’t going to the cinema?",
        "Has Mom been working there since 2006?",
        "Had I been pushing the door for 35 minutes?",
        "Will I have been watching the TV since Felice come?",
        "Would I have been watching the TV since Felice came?"
    )
    private val exampletanyanominal = arrayOf(
        "Are you better than yesterday?",
        "Were you glad to meet him?",
        "Will the police come on time?",
        "Would he be a writer?",
        "Is Fajar a college student?",
        "Was Alea afraid of the dark?",
        "Will she being a hero the day after tomorrow",
        "Would my son being the actor if he wasn’t sick?",
        "Has she been a good doctor for the girl a while ago?",
        "Had I been the teacher some years ago?",
        "Will the students have graduated in some months?",
        "Should I have been a soldier if I was failed?",
        "Has she been being a director since 2 years ago?",
        "Had they been being the choir since 2012?",
        "Will she have been being a doctor since 2016?",
        "Would she have been being a doctor since 2016?"
    )

    private val photo = intArrayOf(
        R.drawable.a,
        R.drawable.b,
        R.drawable.c,
        R.drawable.d,
        R.drawable.e,
        R.drawable.f,
        R.drawable.g,
        R.drawable.h,
        R.drawable.i,
        R.drawable.j,
        R.drawable.k,
        R.drawable.l,
        R.drawable.m,
        R.drawable.n,
        R.drawable.o,
        R.drawable.p
    )


    val listData: ArrayList<ModelTenses>
        get() {
            val list = arrayListOf<ModelTenses>()
            for (position in tenses.indices) {
                val itemtenses = ModelTenses()
                itemtenses.tenses = tenses[position]
                itemtenses.katasinyal = katasinyal[position]
                itemtenses.tentang = tentang[position]

                itemtenses.rumuspositifverbal = rumuspositifverbal[position]
                itemtenses.rumuspositifnominal = rumuspositifnominal[position]

                itemtenses.rumusnegativverbal = rumusnegativverbal[position]
                itemtenses.rumusnegativnominal = rumusnegativnominal[position]

                itemtenses.rumustanyaverbal = rumustanyaverbal[position]
                itemtenses.rumustanyanominal = rumustanyanominal[position]

                itemtenses.examplepositifverbal = examplepositifverbal[position]
                itemtenses.examplepositifnominal = examplepositifnominal[position]

                itemtenses.examplenegativverbal = examplenegativverbal[position]
                itemtenses.examplenegativnominal = examplenegativnominal[position]

                itemtenses.exampletanyaverbal = exampletanyaverbal[position]
                itemtenses.exampletanyanominal = exampletanyanominal[position]
                itemtenses.photo = photo[position]


                list.add(itemtenses)
            }
            return list
        }
}