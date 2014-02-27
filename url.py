# test the urllib module
import urllib.request

# get the url file
urlfile = urllib.request.urlopen('http://www.google.com.hk/')
print(urlfile.read())
urlfile.close()

# retrive url file component
urllib.request.urlretrieve('http://www.google.com.hk/images/srpr/logo9w.png','temp.png')