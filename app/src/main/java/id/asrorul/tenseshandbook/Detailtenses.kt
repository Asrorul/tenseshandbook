package id.asrorul.tenseshandbook

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_detailtenses.*


class Detailtenses : AppCompatActivity() {
    private val list: ArrayList<ModelTenses> = ArrayList()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailtenses)
        getintent()

        //supportActionBar?.setHomeButtonEnabled(true);
        //supportActionBar?.setDisplayHomeAsUpEnabled(true);
        //actionBar?.hide()
        pura2actionbar.setOnClickListener { onBackPressed() }
    }
    override fun onSupportNavigateUp(): Boolean {
        finish()
        return true
    }
    fun getintent(){
        val foto= intent.getIntExtra("foto",R.drawable.a)
        val namatenses= intent.getStringExtra("namatenses")
        val tentang = intent.getStringExtra("tentang")
        val katasinyal = intent.getStringExtra("katasinyal")
        val rumusverbalpositif = intent.getStringExtra("rumusverbalpositif")
        val rumusnominalpositif = intent.getStringExtra("rumusnominalpositif")

        val rumusverbalngativ = intent.getStringExtra("rumusverbalngativ")
        val rumusnominalnegativ = intent.getStringExtra("rumusnominalnegativ")

        val rumusverbalinterogatif = intent.getStringExtra("rumusverbalinterogatif")
        val rumusnominalinterogatif = intent.getStringExtra("rumusnominalinterogatif")

        val examplerumusverbalpositif = intent.getStringExtra("examplerumusverbalpositif")
        val examplerumusnominalpositif = intent.getStringExtra("examplerumusnominalpositif")

        val examplerumusverbalngativ = intent.getStringExtra("examplerumusverbalngativ")
        val examplerumusnominalnegativ = intent.getStringExtra("examplerumusnominalnegativ")

        val examplerumusverbalinterogatif = intent.getStringExtra("examplerumusverbalinterogatif")
        val examplerumusnominalinterogatif = intent.getStringExtra("examplerumusnominalinterogatif")



        Glide.with(this)
            .load(foto)
            .apply(RequestOptions().override(60, 60))
            .into(icontensesdetail)
        keterangan.text = tentang
        if (katasinyal != " ") {
            panelkatasinyal.visibility = View.VISIBLE
            tv_katasinyal.text = katasinyal
        }else{
            panelkatasinyal.visibility= View.INVISIBLE
        }

        if(namatenses!!.contains("Tense")){
            tv_namatenses.text= namatenses.substring(0, namatenses.indexOf("Tense")-1)
        }

        tv_verbalpositif.text = rumusverbalpositif
        tv_verbalexample.text = examplerumusverbalpositif
        tv_nominalpositif.text = rumusnominalpositif
        tv_nominalpositifexample.text = examplerumusnominalpositif

        tv_verbalnegatif.text = rumusverbalngativ
        tv_exampleverbalnegativ.text = examplerumusverbalngativ
        tv_nominalnegativ.text = rumusnominalnegativ
        tv_examplenegativnominal.text = examplerumusnominalnegativ

        tv_verbalinterogativ.text = rumusverbalinterogatif
        tv_exampleinterogativ.text = examplerumusverbalinterogatif
        tv_nominalinterogativ.text = rumusnominalinterogatif
        tv_exampleinerogativnominal.text = examplerumusnominalinterogatif

    }
}
