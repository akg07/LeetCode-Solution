s = "MCMXCIV"

val = {"I":1,
        "V":5,
        "X":10,
        "L":50,
        "C":100,
        "D":500,
        "M":1000
       }
rom = list(s)
integer = 0
prev = 0
n = len(rom)

for i in range(0, n-1, 1):
    if val[rom[i]] <  val[rom[i + 1]]:
        integer -= val[rom[i]]
    else:
        integer += val[rom[i]]

integer += val[rom[n - 1]]
return integer
