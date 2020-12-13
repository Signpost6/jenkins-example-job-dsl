/*
* The Jenkins Seed job for Generating Continuous Integration Builds for the Main Sensei Applications.
*/
listView('1_Build') {
    jobs {
        regex('BUILD--*(.+)')
    }
    columns {
        status()
        weather()
        name()
    }
}
