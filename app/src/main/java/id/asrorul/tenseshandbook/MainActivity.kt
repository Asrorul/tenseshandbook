package id.asrorul.tenseshandbook

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    private lateinit var rvtenses: RecyclerView
    private val list: ArrayList<ModelTenses> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvtenses = findViewById(R.id.rv_tenses)
        rvtenses.setHasFixedSize(true);


        list.addAll(DataTenses.listData);
        showRecyclerList();
    }

    private fun showRecyclerList() {
        rvtenses.layoutManager = LinearLayoutManager(this)
        val listTensesAdapter = AdapterTenses(list)
        rvtenses.adapter = listTensesAdapter

        listTensesAdapter.setOnItemClickCallback(object : AdapterTenses.OnItemClickCallback {
            override fun onItemClicked(data: ModelTenses) {
                val i = Intent(this@MainActivity, Detailtenses::class.java)
                i.putExtra("namatenses",data.tenses)
                i.putExtra("tentang", data.tentang)
                i.putExtra("katasinyal", data.katasinyal)
                i.putExtra("rumusverbalpositif", data.rumuspositifverbal)
                i.putExtra("rumusnominalpositif", data.rumuspositifnominal)
                i.putExtra("foto",data.photo)

                i.putExtra("rumusverbalngativ", data.rumusnegativverbal)
                i.putExtra("rumusnominalnegativ", data.rumusnegativnominal)

                i.putExtra("rumusverbalinterogatif", data.rumustanyaverbal)
                i.putExtra("rumusnominalinterogatif", data.rumustanyanominal)

                i.putExtra("examplerumusverbalpositif", data.examplepositifverbal)
                i.putExtra("examplerumusnominalpositif", data.examplepositifnominal)
                i.putExtra("examplerumusverbalngativ", data.examplenegativverbal)
                i.putExtra("examplerumusnominalnegativ", data.examplenegativnominal)
                i.putExtra("examplerumusverbalinterogatif", data.exampletanyaverbal)
                i.putExtra("examplerumusnominalinterogatif", data.exampletanyanominal)

                startActivity(i)
            }
        })
    }

    private fun showSelectedHero(hero: ModelTenses) {
        Toast.makeText(this, "Kamu memilih " + hero.tenses, Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        startActivity(Intent(this, About::class.java))
        return super.onOptionsItemSelected(item)
    }


}
