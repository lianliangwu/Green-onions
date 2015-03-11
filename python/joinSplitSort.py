a = ['an','bbnn','cnnn','dddnnn','eeeeeeennnnn','11111111111nnnnnnn','22nnnnn','333']

# test the sorted
# common sorted 
print(sorted(a))

# sorted by len
print(sorted(a,key=len))

# sorted reverse
print(sorted(a,reverse = True))

# sorted by key function
# mostA:count the most A
def mostN(value):
	return value.count('n')
print(sorted(a,key = mostN))

# join method
b = ':'.join(a)
print(b)

# split method
print(b.split(':'))