[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/wcA63Dgd)
[![Open in Visual Studio Code](https://classroom.github.com/assets/open-in-vscode-2e0aaae1b6195c2367325f4f02e2d04e9abb55f0b24a779b69b11b9e10269abc.svg)](https://classroom.github.com/online_ide?assignment_repo_id=17722614&assignment_repo_type=AssignmentRepo)
Lab Description :   Read in a group of symbols and check to see if the appropriate opening symbol correctly matches up with the appropriate closing symbol.  
The opening symbols are “{(<[“ and the appropriate closing symbols are “})>]“.

You must read in and analyze each group.  

If you were to read in {[]}, you would have a correct balance of opening and closing symbols.
If you were to read in {[}], you would not have a correct balance of opening and closing symbols.



Sample Data : 
(abc(*def) 
[{}]
[
[{<()>}]
{<html[value=4]*(12)>{$x}}
[one]<two>{three}(four)
car(cdr(a)(b)))
car(cdr(a)(b))


Sample Output :
(abc(*def) is incorrect.

[{}] is correct.

[ is incorrect.

[{<()>}] is correct.

{<html[value=4]*(12)>{$x}} is correct.

[one]<two>{three}(four) is correct.

car(cdr(a)(b))) is incorrect.
car(cdr(a)(b)) is correct.

