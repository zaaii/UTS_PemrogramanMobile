package com.zai.pekerjaan.data

import com.zai.pekerjaan.R
import com.zai.pekerjaan.model.Jobs

class Datasource {

    fun loadJobs(): List<Jobs> {
        return listOf<Jobs>(
            Jobs(R.drawable.ceo, R.string.job1, R.string.Desc01, R.string.gaji01),
            Jobs(R.drawable.dgigi, R.string.job2, R.string.Desc02, R.string.gaji02),
            Jobs(R.drawable.dbedah, R.string.job3, R.string.Desc03, R.string.gaji03),
            Jobs(R.drawable.pilot, R.string.job4, R.string.Desc04, R.string.gaji04),
            Jobs(R.drawable.pengacara, R.string.job5, R.string.Desc05, R.string.gaji05),
            Jobs(R.drawable.salesm, R.string.job6, R.string.Desc06, R.string.gaji06),
            Jobs(R.drawable.guru, R.string.job7, R.string.Desc07, R.string.gaji07),
            Jobs(R.drawable.presiden, R.string.job8, R.string.Desc08, R.string.gaji08),
            Jobs(R.drawable.tentara, R.string.job9, R.string.Desc09, R.string.gaji09),
            Jobs(R.drawable.programmer, R.string.job10, R.string.Desc10, R.string.gaji10),
        )
    }
}
