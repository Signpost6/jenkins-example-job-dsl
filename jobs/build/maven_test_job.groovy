package build

pipelineJob('BUILD--example-maven-project') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url('https://github.com/Signpost6/jenkins-example-java-project.git')
                    }
                    branch('*/master')
                }
            }
            lightweight()
        }
    }
}
