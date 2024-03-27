def call(branch, repo) {           
  sh "git branch:'${branch}', url: '${repo}'"
}