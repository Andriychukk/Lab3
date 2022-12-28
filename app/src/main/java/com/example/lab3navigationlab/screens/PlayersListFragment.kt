package com.example.lab3navigationlab.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.lab3navigationlab.adapter.Adapter
import com.example.lab3navigationlab.databinding.FragmentListBinding
import com.example.lab3navigationlab.model.Model


class PlayersListFragment : Fragment() {
    lateinit var binding: FragmentListBinding
    lateinit var adapter: Adapter
    lateinit var recyclerView: RecyclerView



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initial()
    }

    private fun initial(){
        recyclerView = binding.rvFilm
        adapter = Adapter(this)
        recyclerView.adapter = adapter
        adapter.setList(this.generatePlayersList())
    }

  private fun generatePlayersList(): ArrayList<Model>{
        val PlayersList=ArrayList<Model>()

        val firstPlayer = Model("Lionel Messi","https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Leo_Messi_2016.PNG/640px-Leo_Messi_2016.PNG","Ліоне́ль Андре́с Ме́ссі Куччитті́ні - аргентинський футболіст, плеймейкер, нападник французького клубу «Парі Сен-Жермен». Рекордсмен за кількістю забитих м'ячів у складі збірної Аргентини та «Барселони» Чемпіон світу 2022 року. Віце-чемпіон світу 2014 року. Семиразовий володар призу «Золотий м'яч», зокрема: 2009, 2019 та 2021 роки за версією France Football, 2010, 2011, 2012, 2015 роки за версією об'єднаного трофея від France Football та ФІФА. Мессі деколи називають «новим Марадоною», за його технічну гру та високу результативність. Один з найобдарованіших і найталановитіших атакувальних півзахисників сучасності")
        PlayersList.add(firstPlayer)

        val secondPlayer = Model("Cristiano Ronaldo","https://upload.wikimedia.org/wikipedia/commons/thumb/5/58/Ronaldo_in_2018_%28cropped%29.jpg/640px-Ronaldo_in_2018_%28cropped%29.jpg","Кріштіа́ну Рона́лду душ Са́нтуш Аве́йру - португальський футболіст, вінгер і нападник збірної Португалії, у складі якої є капітаном, а також рекордсменом за кількістю ігор і забитих голів. 27 грудня 2021 року Globe Soccer Awards назвали Роналду найкращим бомбардиром усіх часів. Перший у світі футболіст-мільярдер (2020). П'ятиразовий володар Золотого м'яча 2008, 2013, 2014, 2016 та 2017 років. Шість разів ставав другим футболістом світу 2007, 2009, 2011, 2012, 2015 та 2018 років. Третій футболіст світу 2019 року. Переможець чемпіонату Європи — 2016 у складі збірної Португалії. Переможець Ліги чемпіонів УЄФА сезонів 2007–2008, 2013—2014, 2015—2016, 2016—2017 та 2017–2018 років.")
        PlayersList.add(secondPlayer)

        val thirdPlayer = Model("Neymar Jr.","https://upload.wikimedia.org/wikipedia/commons/thumb/7/75/20141118_AUTBRA_5088.jpg/640px-20141118_AUTBRA_5088.jpg","Нейма́р да Сі́лва Са́нтус Жуніо́р - бразильський футболіст. Нападник збірної Бразилії та французького «Парі Сен-Жермен». 9 січня 2012 року отримав нагороду імені Ференца Пушкаша за найкращий гол, забитий 2011 року. Рекордсмен футбольного трансферного ринку— €222млн.Неймар народився в сім'ї торговця ювелірними виробами Неймара Сантуса. Він вихованець клубу «Сантос», куди потрапив у 1999 році. За свою кар'єру встиг пограти за такі всесвітньо відомі клуби, як \"Барселона\" та \"Парі-Сен-Жермен\"")
        PlayersList.add(thirdPlayer)

        return PlayersList
    }
}