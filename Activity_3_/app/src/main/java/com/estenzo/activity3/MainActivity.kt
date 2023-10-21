package com.estenzo.activity3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.estenzo.activity3.adapters.PersonAdapter
import com.estenzo.activity3.databinding.ActivityMainBinding
import com.estenzo.activity3.model.Person

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val persons: MutableList<Person> = ArrayList()
        persons.add(Person("Monkey D. Luffy", "Gum-Gum Fruit Powers", "Luffy has consumed the Gum-Gum Fruit, granting him the ability to stretch his body like rubber. He uses these powers to become a formidable pirate and fight against other pirates and the World Government."))

        persons.add(Person("Roronoa Zoro", "Three-Sword Style Swordsmanship", "Zoro is a master swordsman who wields three swords simultaneously. He uses his incredible skill to become the world's greatest swordsman and fights with honor and determination."))

        persons.add(Person("Nami", "Weather Control", "Nami is a skilled navigator with the power to control the weather. She uses this ability to guide her crew safely through the Grand Line and face various challenges."))

        persons.add(Person("Usopp", "Sniper and Inventor", "Usopp is a sharpshooter and a brilliant inventor. He uses his sniping skills and creates unique gadgets to assist his crew in battles and adventures."))

        persons.add(Person("Sanji", "Black Leg Style Martial Arts", "Sanji is a master of Black Leg Style martial arts, using his powerful kicks in combat. He combines his fighting skills with a love for cooking to support his crew."))

        persons.add(Person("Tony Tony Chopper", "Human-Human Fruit Powers", "Chopper has consumed the Human-Human Fruit, allowing him to transform into different forms, including a giant reindeer. He uses these transformations to assist his friends and patients as a doctor."))

        persons.add(Person("Nico Robin", "Flower-Flower Fruit Powers", "Robin possesses the Flower-Flower Fruit powers, which enable her to sprout extra limbs and create weapons from her body. She uses this ability to uncover ancient secrets and assist the Straw Hat crew."))

        persons.add(Person("Franky", "Cyborg Capabilities", "Franky is a cyborg with tremendous strength and various built-in weapons. He uses his engineering skills and enhanced physical abilities to support the crew and navigate their ship."))

        persons.add(Person("Brook", "Revive-Revive Fruit Powers", "Brook has eaten the Revive-Revive Fruit, which allows him to return to life after death. He uses his powers to entertain, fight, and explore the mysteries of the Grand Line."))

        persons.add(Person("Jinbei", "Fish-Man Karate", "Jinbei is a Fish-Man Karate master, using water-based martial arts in battle. He also serves as a helmsman and a loyal member of the Straw Hat crew."))

        persons.add(Person("Portgas D. Ace", "Mera Mera no Mi Powers", "Ace had the powers of the Flame-Flame Fruit, enabling him to create and control fire. He was a powerful pirate and the older brother of Luffy, who fought for his beliefs and family."))

        persons.add(Person("Dracule Mihawk", "World's Greatest Swordsman", "Mihawk is considered the world's greatest swordsman and wields the legendary sword 'Kokuto Yoru.' He is known for his unmatched swordsmanship and is a powerful figure in the One Piece world."))

        persons.add(Person("Boa Hancock", "Love-Love Fruit Powers", "Hancock possesses the Love-Love Fruit powers, allowing her to turn people to stone with her beauty. She is the ruler of Amazon Lily and a member of the Seven Warlords of the Sea."))

        persons.add(Person("Buggy the Clown", "Bara Bara Fruit Powers", "Buggy has consumed the Bara Bara Fruit, which allows him to split his body into separate parts. He uses this ability to perform comedic acts and lead his pirate crew."))

        persons.add(Person("Shanks", "Haki and Supreme Swordsmanship", "Shanks is a Yonko (one of the Four Emperors of the Sea) known for his mastery of Haki and supreme swordsmanship. He is a pivotal figure in the One Piece world and a former member of Gol D. Roger's crew."))

        persons.add(Person("Kaido", "Mythical Zoan Dragon Powers", "Kaido possesses the power of the Mythical Zoan-type Dragon Devil Fruit. He is known as one of the Four Emperors and seeks to create the ultimate army of Zoan users."))

        persons.add(Person("Big Mom (Charlotte Linlin)", "Sorcery-Paramecia Fruit Powers", "Big Mom wields the power of the Sorcery-Paramecia Fruit, allowing her to manipulate souls. She is another of the Four Emperors and leads the Big Mom Pirates."))

        persons.add(Person("Eustass Kid", "Magnet-Magnet Fruit Powers", "Kid has the Magnet-Magnet Fruit powers, giving him control over magnetic forces. He is a notorious pirate captain known for his brutal and ruthless tactics."))

        persons.add(Person("Trafalgar Law", "Ope Ope Fruit Powers", "Law has consumed the Ope Ope Fruit, granting him the power of the 'Room' and the ability to perform complex surgeries on people. He is a member of the Worst Generation and a formidable pirate."))

        persons.add(Person("Donquixote Doflamingo", "String-String Fruit Powers", "Doflamingo possesses the String-String Fruit, allowing him to create and control razor-sharp strings. He was a Shichibukai (Warlord of the Sea) and a major antagonist in the Dressrosa Arc."))

        persons.add(Person("Gol D. Roger", "King of the Pirates", "Gol D. Roger was the Pirate King and captain of the Roger Pirates. He is known for discovering the One Piece treasure and starting the Great Pirate Era."))

        val context = this
        val adapter = PersonAdapter(persons, context)

        binding.personList.layoutManager = LinearLayoutManager(this)
        binding.personList.adapter = adapter
    }
}