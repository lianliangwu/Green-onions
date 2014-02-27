# test the regular expressions
import re

match = re.search(r'[\w.]+@[\w.]+','nick nick.david@gmail.com')

if match:
	print(match.group())