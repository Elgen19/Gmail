package com.prestosa.gmailrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.prestosa.gmailrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val itemList = listOf(
            RecyclerAdapter.MyDataModel(
                "Monkey D. Luffy",
                "Software Developer Application",
                "Ahoy there! I'm Monkey D. Luffy, and I'm setting sail to join your crew as a Software Developer. I've mastered the art of coding like I've mastered the seas. Let's navigate the world of software together!"
            ),

            RecyclerAdapter.MyDataModel(
                "Roronoa Zoro",
                "Senior Backend Developer Application",
                "Santoryu swordsman, Roronoa Zoro, reporting for duty! I'm not just good with swords; my skills extend to backend development. I can handle multiple tasks as effortlessly as I handle my swords. Hire me, and let's cut through the challenges together!"
            ),

            RecyclerAdapter.MyDataModel(
                "Nami",
                "UI/UX Designer Application",
                "Navigator extraordinaire, Nami, charting a course for your UI/UX team! With my navigational skills and an eye for design, I'll make sure our applications sail smoothly through user experiences. Let's make the UI as beautiful as the Grand Line!"
            ),

            RecyclerAdapter.MyDataModel(
                "Usopp",
                "Frontend Developer Application",
                "Sharpshooter Usopp here, taking aim at the frontend challenges! From crafting intricate user interfaces to tackling bugs, I've got it covered. Join my crew, and let's make web development snipe-tastically amazing!"
            ),

            RecyclerAdapter.MyDataModel(
                "Sanji",
                "Full-stack Developer Application",
                "Chef and Full-stack Developer, Sanji, at your service! Just as I can create culinary masterpieces, I can craft efficient and delicious code. Hire me, and let's cook up some fantastic software solutions together!"
            ),

            RecyclerAdapter.MyDataModel(
                "Tony Tony Chopper",
                "Mobile App Developer Application",
                "Tony Tony Chopper, reindeer and Mobile App Developer extraordinaire! I'm not just cute; I can develop mobile apps that will melt your heart. Join my crew, and let's create apps that everyone will love!"
            ),

            RecyclerAdapter.MyDataModel(
                "Nico Robin",
                "Database Administrator Application",
                "Archaeologist and Database Administrator, Nico Robin, seeking a position in your crew. I can unearth the hidden treasures in your data and ensure the databases are as secure as the Poneglyphs. Let's build a reliable data infrastructure together!"
            ),

            RecyclerAdapter.MyDataModel(
                "Franky",
                "DevOps Engineer Application",
                "Super shipwright and DevOps Engineer, Franky, offering to join your crew. I can build not only mighty ships but also robust DevOps pipelines. Let's sail smoothly through continuous integration and deployment!"
            ),

            RecyclerAdapter.MyDataModel(
                "Brook",
                "Software Quality Assurance Application",
                "Soul King and Software Quality Assurance specialist, Brook, applying to ensure the soul of our software stays smooth and bug-free. Hire me, and together, we'll make sure our software sings without a discordant note!"
            ),

            RecyclerAdapter.MyDataModel(
                "Jinbe",
                "Cybersecurity Analyst Application",
                "Helmsman Jinbe here, offering my expertise as a Cybersecurity Analyst. I'll navigate through the digital seas, warding off any security threats. Let's keep our software safe and secure on this adventurous journey!"
            ),
            RecyclerAdapter.MyDataModel(
                "Sir Crocodile",
                "Application for Lead Software Architect",
                "Sir Crocodile here, seeking to lead your crew as a Software Architect. Just as I manipulate sand to my advantage, I'll craft software solutions that stand the test of time. Join me, and we'll build an empire of code!"
            ),

            RecyclerAdapter.MyDataModel(
                "Buggy the Clown",
                "QA Tester Application",
                "The one and only Buggy the Clown applying to be your QA Tester! Just as I skillfully juggle my way through obstacles, I'll catch bugs before they become a circus. Hire me, and let's make sure our software is a flawless performance!"
            ),

            RecyclerAdapter.MyDataModel(
                "Captain Kuro",
                "Stealthy Backend Developer Application",
                "Captain Kuro, the master of stealth, applying to be your Backend Developer. My coding skills are as silent as my cat paws. Join me, and together, we'll navigate the shadows of software development!"
            ),

            RecyclerAdapter.MyDataModel(
                "Donquixote Doflamingo",
                "Full-stack Developer Application",
                "The Heavenly Demon Doflamingo submitting my application as a Full-stack Developer. Just as I control strings effortlessly, I'll weave an intricate web of code. Hire me, and let's make software development a puppet dance!"
            ),

            RecyclerAdapter.MyDataModel(
                "Enel",
                "Cloud Solutions Architect Application",
                "Enel, the lightning deity, applying to be your Cloud Solutions Architect. I'll electrify your cloud infrastructure, making it as powerful as the thunder itself. Join me, and let's reach the digital heavens together!"
            ),

            RecyclerAdapter.MyDataModel(
                "Gecko Moria",
                "Application for DevOps Engineer",
                "Gecko Moria, the Shadow's Asgard, applying to be your DevOps Engineer. Just as I control shadows, I'll streamline our development operations. Hire me, and let's make sure our code emerges from the shadows flawlessly!"
            ),

            RecyclerAdapter.MyDataModel(
                "Bartholomew Kuma",
                "Cybersecurity Analyst Application",
                "Bartholomew Kuma applying to be your Cybersecurity Analyst. I'll repel security threats with the might of my Paw-Paw Fruit power. Join me, and we'll create a protective bubble around our software!"
            ),

            RecyclerAdapter.MyDataModel(
                "Rob Lucci",
                "Machine Learning Engineer Application",
                "Rob Lucci, the CP9 agent, applying to be your Machine Learning Engineer. My skills are as precise as my Rankyaku kicks. Hire me, and we'll make our software learn and adapt seamlessly!"
            ),

            RecyclerAdapter.MyDataModel(
                "Akainu",
                "Lead Software Engineer Application",
                "Admiral Akainu, the magma man, applying to lead your crew as a Software Engineer. Just as I bring justice to the seas, I'll bring excellence to your codebase. Join me, and let's forge a software empire!"
            ),

            RecyclerAdapter.MyDataModel(
                "Blackbeard",
                "Application for Data Scientist",
                "Blackbeard, the wielder of two Devil Fruits, applying to be your Data Scientist. I'll uncover the mysteries of our data as I did with the Yami Yami no Mi. Hire me, and let's harness the power of information!"
            )
        )




        val adapter = RecyclerAdapter(itemList, ::onItemClick)

        with(binding.recyclerView) {
            layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = adapter
        }
    }

    private fun onItemClick(item: RecyclerAdapter.MyDataModel) {
        // Handle the item click here
        val intent = Intent(this, DetailActivity::class.java).apply {
            putExtra("NAME_PARAMS", item.name)
            putExtra("SUBJECT_PARAMS", item.subject)
            putExtra("MESSAGE_PARAMS", item.body)
        }
        startActivity(intent)
    }

}