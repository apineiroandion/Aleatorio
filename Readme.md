# exercicio 11
## aleatorio

Gardar os contidos dos tres arrays seguintes nun ficheiro aleatorio (creado en modo lectura escritura)  tendo en conta que cada tres elementos que  ocupan a mesma posicion nos arrays representan un codigo unha descricion e un prezo:
String[] codes={"p1","p2","p3"};
String[] descricion ={"parafusos","cravos ","tachas"};
int[] prices ={3,4,5};

      nota: ter en conta que asignaremos unha lonxitude fixa a cada rexistro
      así para o codigo asignaremos 3 caracteres(6 bytes), para a descrición 10caracteres(20bytes),  e o prezo por ser un  enteiro terá asignados 4 bytes, sendo o tamaño total do rexistro de 30 bytes
      
      nota IMPORTANTE: a clase a usar e RandomAcessFile(obxecto File, "rw")e os seus metodos para escritura e lectura de tipos primitivos de datos (writeChars(..)  , writeInt(..) , readChar()..readInt()) 

Antes de gravar os datos dun rexistro deberá  utilizarse   un método que encha cos espazos que faltan os campos   codigo e descricion ata completar as lonxitudes de ditos campos cun caracter calquera.
Pista : A clase String ten un metodo denonimado format que permite dar formato a unha cadea : String x= String.format("%" + width + "s", t).replace(' ','0')
onde:
width:   e o ancho final da cadea en numero de caracteres
t  :        e a cadea  
"%" : enche con blancos pola esquerda  (con "%-" encheria con blancos pola dereita)
se ademais lle aplicamos ao metodo format  o metodo   replace(' ', '0')     cambiara os blancos por ceros ( esto e interesante se nun primeiro momento queremos ver o efecto de aplicar ‘format’ porque os blancos non se ven na impresión pero os cero si)


Unha vez almacenados os tres rexistros no ficheiro aleatorio deberemos ler e amosar o contido dos campos do rexistro que ocupa a posicion numero 2  utilizando o metodo seek(int n  ) da clase RandomAccessFile que permite posicionarnos no byte indicado dentro de dito ficheiro.

Ter en conta que ao ler o rexistro deberemos voltar a separar os seus contidos e quitarlle os blancos ás cadeas de texto para poder poder  cargar correctamente ditos valores en variables java  adecuadas ( String)  excepto o valor que foi grabado con enteiro que simplemente debe ser convertido a enteiro mediante csteo.

      e decir o resultado da consulta  deberia amosarse algo parecido a isto:
      
       p2
        cravos 
      4
 
