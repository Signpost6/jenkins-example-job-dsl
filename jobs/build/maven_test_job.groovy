package build

pipelineJob('BUILD--example-maven-project') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('git@github.com:Signpost6/jenkins-example-java-project.git')
                        credentials("vcetinick-sp6")
                    }
                    branch('*/master')
                }
            }
            lightweight()
        }
    }
}
