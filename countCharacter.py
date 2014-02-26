# count every character's number in the check_string

check_string = 'i love you, xiu er, good night'
count = {}
for s in check_string:
	if count.__contains__(s):
		count[s] += 1
	else:
		count[s] = 1
for key in count:
	if count[key] > 1 and key.isspace() == False:
		print(key, count[key])
