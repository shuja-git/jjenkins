//pipelineJob('frontend') {
//  configure { flowdefinition ->
//    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
//      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
//        'userRemoteConfigs' {
//          'hudson.plugins.git.UserRemoteConfig' {
//            'url'('https://DevOps-Batches@dev.azure.com/DevOps-Batches/DevOps60/_git/frontend')
//          }
//        }
//        'branches' {
//          'hudson.plugins.git.BranchSpec' {
//            'name'('*/main')
//          }
//        }
//      }
//      'scriptPath'('Jenkinsfile')
//      'lightweight'(true)
//    }
//  }
//}

//pipelineJob('roboshop-ansible') {
//  configure { flowdefinition ->
//    flowdefinition << delegate.'definition'(class:'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition',plugin:'workflow-cps') {
//      'scm'(class:'hudson.plugins.git.GitSCM',plugin:'git') {
//        'userRemoteConfigs' {
//          'hudson.plugins.git.UserRemoteConfig' {
//            'url'('https://github.com/raghudevopsb61/ansible.git')
//          }
//        }
//        'branches' {
//          'hudson.plugins.git.BranchSpec' {
//            'name'('*/main')
//          }
//        }
//      }
//      'scriptPath'('Jenkinsfile')
//      'lightweight'(true)
//    }
//  }
//}
//
//folder('CI-Pipelines') {
//  displayName('CI-Pipelines')
//  description('CI-Pipelines')
//}
//
//def COMPONENTS = ["cart", "catalogue", "payment", "shipping", "user", "dispatch"]
//
//def SIZE =  COMPONENTS.size -1
//
//for(i in 0..SIZE) {
//  def j = COMPONENTS[i]
//  pipelineJob("CI-Pipelines/${j}") {
//    configure { flowdefinition ->
//      flowdefinition << delegate.'definition'(class: 'org.jenkinsci.plugins.workflow.cps.CpsScmFlowDefinition', plugin: 'workflow-cps') {
//        'scm'(class: 'hudson.plugins.git.GitSCM', plugin: 'git') {
//          'userRemoteConfigs' {
//            'hudson.plugins.git.UserRemoteConfig' {
//              'url'("https://github.com/raghudevopsb61/${j}.git")
//            }
//          }
//          'branches' {
//            'hudson.plugins.git.BranchSpec' {
//              'name'('*/main')
//            }
//          }
//        }
//        'scriptPath'('Jenkinsfile')
//        'lightweight'(true)
//      }
//    }
//  }
//}



