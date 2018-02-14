package com.job.gitapp

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import com.job.gitapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //now we can access the binding
        //binding.repositoryName.text = "The Git App"
        /*binding.userName.text = "Job Getabu"
        binding.stars.text = "100 Stars"*/

        val repo=Repository("TheGit","Mr JobGetabu",200,false)
        binding.repository = repo
        //binding.setVariable(BR.repository,repo)
        binding.executePendingBindings()

        //added a BaseObserver to our repository to track/update changes
        Handler().postDelayed({repo.repositoryName="Dynamic Change Design"}, 2000)
    }
}
