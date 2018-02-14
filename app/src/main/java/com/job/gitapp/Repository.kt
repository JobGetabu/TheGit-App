package com.job.gitapp

import android.databinding.BaseObservable
import android.databinding.Bindable

/**
 * Created by JOB on 2/14/2018.
 */

class Repository(repositoryName : String, var repositoryOwner: String?, var numberOfStars: Int?
                 , var hasIssues: Boolean = false) : BaseObservable(){

    @get:Bindable
    var repositoryName : String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.repositoryName)
        }

}
