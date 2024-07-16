
n = 345

def solution(n):
    res = ""
    place = 1
    map = {0:"",1:"One",2:"Two",3:"Three",4:"Five",5:"Five",6:"Six",7:"Seven",8:"Eight",9:"Nine",
           10:"Ten",11:"Eleven",12:"Twelve",13:"Thirteen",14:"Fourteen",15:"Fifteen",16:"Sixteen",17:"Seventeen",18:"Eighteen",19:"Nineteen",
           20:"Twenty",30:"Thirty",40:"Forty",50:"Fifty",60:"Sixty",70:"Seventy",80:"Eighty",90:"Ninety"}
    while(n!=0):
        rem = n%10
        if(place==1 ):
            res = map[rem*place]+" " + res
        if(place==10):
            if(rem==1):
                res = map[rem+place] + " "
            else:
                res = map[rem*place] + " " + res
        if(place==100):
            res = map[rem] +" Hundred and " + res
        if(place==1000):
            res = map[rem] +" Thousand and " + res
        n = n//10
        place*=10

    return res

print(solution(n))
