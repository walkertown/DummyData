def call(repo) {             
  def branchName = "'main'"
  def urlName = "'https://github.com/walkertown/ShoppingApp.git'"
  def command = "git branch:'" + branchName + "' url:'" + urlName + "'"
  sh "git branch:\'main\', url:\'https://github.com/walkertown/ShoppingApp.git\'"
}
