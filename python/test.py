# class Student(object):
# 	"""Student class"""
# 	def __init__(self, arg):
# 		self.arg = 1

# student = Student(4)
		
a = [1,2,3,4,5,6,7,8,9,'aa','bb','cc','dd']

# copy a to a new list b 
b = list(a)

# share the data memory,c and a is different pointer to the memory
c = a
del a
print('Test share memory pointer:',c)

# for loop
for num in b:
	if num == 'aa':
		print('Test for loop:',num)


# sort method
list = ['e','a','b','c','dd','1']
sortList = sorted(list)
print('Test sorted list:',sortList)
