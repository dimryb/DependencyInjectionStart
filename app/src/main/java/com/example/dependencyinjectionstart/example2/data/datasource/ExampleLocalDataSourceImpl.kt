package com.example.dependencyinjectionstart.example2.data.datasource

import com.example.dependencyinjectionstart.example2.data.mapper.ExampleDatabase

class ExampleLocalDataSourceImpl(
    private val database: ExampleDatabase
) : ExampleLocalDataSource {

    override fun method() {
        database.method()
    }
}
