import re

# read every lines in a file
file = open('./file.txt',mode = 'rU',encoding = 'utf8')
line = file.read()
# lines = file.readlines()

# split by one decimeter
list = line.split()
for word in list:
	word.replace(',','')
	word.replace('.','')

# split by more than one decimeter
# list = re.split(',|\n| ', line)

# dict
count = {}

# count the number of word
for word in list:
	if count.__contains__(word):
		count[word] +=1
	else :
		count[word] = 1
for key in count:
	print('key:',key,'-->',count[key])

# searce method
match = re.search('love',line)
if match:
	print(match.group())
else:
	print('Not Found Love')

