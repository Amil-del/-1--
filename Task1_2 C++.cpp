//Создаем тип переменной список на C++
std::list<int> list2 = {1, 3, 4, 2, 5}
//Создаем стек на C++
#include <iostream>  
using namespace std;  
class Stack {  
private:  
enum MAX = 10;  
int st[MAX];  // стек в виде массива  
int top;  // вершина стека  
public:  
Stack() { top = 0; }  
void push(int var) { st[++top] = var; }  
int pop() { return st[top--]; }  
};  
int main() { Stack s1; s1.push(11); s1.push(22); cout << "1: " << s1.pop() << endl; cout << "2: " << s1.pop() << endl;  
return 0; }  
