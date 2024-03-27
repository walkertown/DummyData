def call(repo) {           
  "'Hello Triple" + "Multiple lines'";
  def branchName = "'main'"
  def urlName = "'https://github.com/walkertown/ShoppingApp.git'"
  def command = "git branch:" + branchName + " url:" + urlName
  sh command
}
