## lesson1 google 
# python only check the line when it runs that line
# import sys

# Define hello function 
def hello(name):
	hello = name + ',welcome to SJTU'
	print(hello)

# Main function
def main():
	name = input()
	hello(name)

# Standard boilerplate to call the main() function to begin the program.
if __name__ == '__main__':
	main()
else:
	pass