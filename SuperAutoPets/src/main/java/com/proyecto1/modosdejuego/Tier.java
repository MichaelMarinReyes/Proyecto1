package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.alimentos.Comida;

/**
 *
 * @author michael
 */
public class Tier {

    Mascota[] nuevoTier;
    Comida[] nuevaComida;
    int cantidadAnimales = 54;
    int cantidadComida = 18;

    Mascota[] arregloMascotas = new Mascota[cantidadAnimales];
    Comida[] arregloComida = new Comida[cantidadComida];

    OrdenamientoYBusqueda ordenar = new OrdenamientoYBusqueda();

    public void almacenarMascotas() {

        Mascota hormiga = new Mascota("Hormiga", 2, 1, "Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir");
        Mascota pescado = new Mascota("Pescado", 2, 3, "Power - up: Da a todos los aliados(+1 / +1) / (+2 / +2) al subir de nivel");
        Mascota mosquito = new Mascota("Mosquito", 2, 2, "Piquete inicial: Al iniciar batalla realiza 1 de daño a(1) / (2) / (3) enemigos");
        Mascota grillo = new Mascota("Grillo", 1, 2, "Zombificación: Convoca a un grillo zombie con estadísticas: (1 / 1) / (2 / 2) / (3 / 3) al morir");
        Mascota castor = new Mascota("Castor", 2, 2, "Represa: Da a 2 aliados al azar + 1 / +2 / +3 HP al venderse");
        Mascota caballo = new Mascota("Caballo", 2, 1, "Rugido aliado: Da + 1 / +2 / +3 ATK a los aliados invocados");
        Mascota nutria = new Mascota("Nutria", 1, 2, "Ventaja económica: Da a un aliado aleatorio(+1 / +1) / (+2 / +2) / (+3 / +3) al comprarse");
        Mascota escarabajo = new Mascota("Escarabajo", 2, 3, "Apetito: Otorga a las mascotas de la tienda + 1 / +2 / +3 HP al comer comida de la tienda");
        Mascota sapo = new Mascota("Sapo", 3, 3, "Metamorfosis: Copia la salud del aliado más saludable");
        Mascota dodo = new Mascota("Dodo", 2, 3, "División de poder: Da al aliado de adelante 50%/100%/150% ATK al iniciar la batalla");
        Mascota elefante = new Mascota("Elefante", 3, 5, "Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar");
        Mascota puercoEspin = new Mascota("Puerco Espin", 3, 2, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
        Mascota pavoreal = new Mascota("Pavoreal", 2, 5, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
        Mascota rata = new Mascota("Rata", 4, 5, "Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir");
        Mascota zorro = new Mascota("Zorro", 5, 2, "Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)");
        Mascota araña = new Mascota("Araña", 3, 2, "Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir");
        Mascota camello = new Mascota("Camello", 2, 5, "Joroba: Dar amigo detrás (+1/+2)/ (+2/+4) / (+3/+6)");
        Mascota mapache = new Mascota("Mapache", 5, 4, "Repartir poder: Otorga 1x/2x/3x ATK a las mascotas adyacentes al morir");
        Mascota jirafa = new Mascota("Jirafa", 2, 5, "Fortaleza aliada: Da 1/ 2 / 3 amigos por delante +1/+1 al finalizar el turno de compra");
        Mascota tortuga = new Mascota("Tortuga", 1, 2, "Protección aliada: Dar 1/2/3 amigos detrás de Melón Armor al morir");
        Mascota caracol = new Mascota("Caracol", 2, 2, "Resurgir: si perdiste la última batalla, dales a todos los amigos (+1/+1)/ (+2/+2) / (+3/+3) al comprar");
        Mascota oveja = new Mascota("Oveja", 2, 2, "Revolución: invoca dos (2/2)/ (4/4) / (6/6) carneros al morir");
        Mascota conejo = new Mascota("Conejo", 3, 2, "Cariño: Cuando un amigo come comida de la tienda: Le da +1/ +2 / +3 HP");
        Mascota lobo = new Mascota("Lobo", 3, 4, "Aullido: Si es el último con vida gana (+2/+2)(+3,+3)(+5,+5) permanentemente");
        Mascota buey = new Mascota("Buey", 1, 4, "Mejor me protejo: gana armadura de melón y +2/ +4/ + 6 ATK cuando la mascota aliada de delante se debilita");
        Mascota canguro = new Mascota("Canguro", 1, 2, "Ya quiero pelear: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) cada que la mascota aliada de delante ataque");
        Mascota buho = new Mascota("Buho", 5, 3, "Suerte amigos: Dar un amigo al azar (+2/+2)/ (+4/+4) / (+6/+6) al vender");
        Mascota venado = new Mascota("Venado", 1, 1, "Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir");
        Mascota loro = new Mascota("Loro", 5, 3, "Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl 1/2/3 hasta el final de la batalla");
        Mascota hipopotamo = new Mascota("Hipopótamo", 4, 7, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
        Mascota delfin = new Mascota("Delfin", 1, 2, "Salpicón: reparte 5/10/15 de daño al enemigo con la salud más baja al comenzar la batalla");
        Mascota puma = new Mascota("Puma", 3, 7, "Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar");
        Mascota ballena = new Mascota("Ballena", 3, 8, "Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después de debilitarse");
        Mascota ardilla = new Mascota("Ardilla", 2, 5, "Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por 1/2/3 de oro");
        Mascota llama = new Mascota("Llama", 3, 6, "Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana (+2/+2)/ (+4/+4) / (+6/+6)");
        Mascota foca = new Mascota("Foca", 3, 8, "Compartir poder: Al recibir comida de la tienda da a  2 amigos randoms (+1/+1)(+2/+2)/(+3/+3)");
        Mascota jaguar = new Mascota("Jaguar", 7, 4, "Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño");
        Mascota escorpion = new Mascota("Escorpion", 1, 1, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
        Mascota rinoceronte = new Mascota("Rinoceronte", 5, 8, "Estampida: Inflige 4/8/12 de daño al primer enemigo");
        Mascota mono = new Mascota("Mono", 1, 2, "Amistad: Dar al amigo más a la derecha (+2/+3)/ (+4/+6) / (+6/+9)");
        Mascota cocodrilo = new Mascota("Cocodrilo", 8, 4, "Mordida: (Comienzo de la batalla) inflige 8/16/24 de daño al último enemigo");
        Mascota vaca = new Mascota("Vaca", 4, 6, "Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da (+1/+2)/ (+2/+4) / (+3/+6)");
        Mascota chompipe = new Mascota("Chompipe", 3, 6, "Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado");
        Mascota panda = new Mascota("Panda", 5, 5, "Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido");
        Mascota gato = new Mascota("Gato", 4, 5, "Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4");
        Mascota tigre = new Mascota("Tigre", 4, 3, "Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel 1/2/3");
        Mascota serpiente = new Mascota("Serpiente", 6, 6, "Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca");
        Mascota mamut = new Mascota("Mamut", 3, 10, "Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6)");
        Mascota leopardo = new Mascota("Leopardo", 10, 4, "Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios");
        Mascota gorila = new Mascota("Gorila", 6, 9, "Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla)");
        Mascota pulpo = new Mascota("Pulpo", 8, 8, "Habilidades por nivel (1) Subir de nivel: Gana +8/8. (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar (3) Antes del ataque: inflige 5 de daño a todos los enemigos");
        Mascota mosca = new Mascota("Mosca", 5, 5, "Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla)");
        Mascota quetzal = new Mascota("Quetzal", 10, 10, "Habilidades por nivel (1) Agrega a su vida la suma de toda la vida de los animales tipos aves (2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves (3) Hace lo del nivel 2 pero con todos los animales");
        Mascota camaleon = new Mascota("Camaleon", 8, 8, "Habilidades por nivel (1) Copia la vida del enemigo más fuerte (2) Copia la vida y el daño del enemigo más fuerte (3) Copia la vida, el daño y la habilidad del enemigo más fuerte");

        arregloMascotas[0] = hormiga;
        arregloMascotas[1] = pescado;
        arregloMascotas[2] = mosquito;
        arregloMascotas[3] = grillo;
        arregloMascotas[4] = castor;
        arregloMascotas[5] = caballo;
        arregloMascotas[6] = nutria;
        arregloMascotas[7] = escarabajo;
        arregloMascotas[8] = sapo;
        arregloMascotas[9] = dodo;
        arregloMascotas[10] = elefante;
        arregloMascotas[11] = puercoEspin;
        arregloMascotas[12] = pavoreal;
        arregloMascotas[13] = rata;
        arregloMascotas[14] = zorro;
        arregloMascotas[15] = araña;
        arregloMascotas[16] = camello;
        arregloMascotas[17] = mapache;
        arregloMascotas[18] = jirafa;
        arregloMascotas[19] = tortuga;
        arregloMascotas[20] = caracol;
        arregloMascotas[21] = oveja;
        arregloMascotas[22] = conejo;
        arregloMascotas[23] = lobo;
        arregloMascotas[24] = buey;
        arregloMascotas[25] = canguro;
        arregloMascotas[26] = buho;
        arregloMascotas[27] = venado;
        arregloMascotas[28] = loro;
        arregloMascotas[29] = hipopotamo;
        arregloMascotas[30] = delfin;
        arregloMascotas[31] = puma;
        arregloMascotas[32] = ballena;
        arregloMascotas[33] = ardilla;
        arregloMascotas[34] = llama;
        arregloMascotas[35] = foca;
        arregloMascotas[36] = jaguar;
        arregloMascotas[37] = escorpion;
        arregloMascotas[38] = rinoceronte;
        arregloMascotas[39] = mono;
        arregloMascotas[40] = cocodrilo;
        arregloMascotas[41] = vaca;
        arregloMascotas[42] = chompipe;
        arregloMascotas[43] = panda;
        arregloMascotas[44] = gato;
        arregloMascotas[45] = tigre;
        arregloMascotas[46] = serpiente;
        arregloMascotas[47] = mamut;
        arregloMascotas[48] = leopardo;
        arregloMascotas[49] = gorila;
        arregloMascotas[50] = pulpo;
        arregloMascotas[51] = mosca;
        arregloMascotas[52] = quetzal;
        arregloMascotas[53] = camaleon;

    }

    public void copiarTierMascotas(int cantidadDeAnimalesDesbloquados) {

        for (int i = 0; i < cantidadDeAnimalesDesbloquados; i++) {
            arregloMascotas[i] = nuevoTier[i];
        }
    }

    public void almacenarTierComida() {
        Comida manzana = new Comida("Manzana", "Da 1 de vida y 1 de daño a un animal seleccionado", 1, 1);
        Comida naranja = new Comida("Naranja", "Efecto", "Hace que regrese un 10% de daño");
        Comida miel = new Comida("Miel", "Efecto", "Cuando la mascota a la que se le dio la miel muere, es remplazada con una abeja de 1 de vida y 1 de daño");
        Comida pastelito = new Comida("Pastelito", "Da 3 de vida y 3 de daño por la siguiente ronda de pelea", 3, 3);
        Comida huesoDeCarne = new Comida("Hueso de Carne", "Efecto", "Da al animal 5 de daño extra", 0, 5);
        Comida pastillaDormir = new Comida("Pastilla para dormir", "Hace que nuestra mascota se desmaye en la fase de menú entre batalla", 0, 0);
        Comida ajo = new Comida("Ajo", "Efecto", "Da armadura que hace que reciba 2 de daño menos", 2, 0);
        Comida ensalada = new Comida("Ensalada", "Da 1 de vida y 1 de daño a 2 animales aleatorios del equipo", 1, 1);
        Comida enlatado = new Comida("Comida enlatada", "Da a los animales que estan en la tienda y proximos que aparezcan 1 de vida y 2 de daño", 1, 2);
        Comida pera = new Comida("Pera", "Da al animal escogido 2 de vida y 2 de daño", 2, 2);
        Comida chile = new Comida("Chile", "Efecto", "Hace que el animal portador haga 5 de daño al animal que se encuentra detras del que atacó");
        Comida chocolate = new Comida("Chocolate", "Da 1 de experiencia a un animal de tu equipo", 0, 0);
        Comida sushi = new Comida("Sushi", "Da 1 de vida y 1 de daño a 3 animales aleatorios del equipo", 1, 1);
        Comida melon = new Comida("Melón", "Efecto", "El animal que lo porte no recibira daño la primera vez que sea atacado");
        Comida hongo = new Comida("Hongo", "Efecto", "Cuando el animal muere vuelve a aparecer con 1 de vida y 1 de daño");
        Comida pizza = new Comida("Pizza", "Da 2 de vida y 2 de daño a 2 animales aleatorios del equipo", 2, 2);
        Comida carne = new Comida("Carne", "Efecto", "Hace que el animal que lo porte haga 20 de daño adicional 1 vez por ronda", 0, 20);
        Comida gelatina = new Comida("Gelatina", "Efecto", "El animal que lo porte puede tener un tipo extra");

        arregloComida[0] = manzana;
        arregloComida[1] = naranja;
        arregloComida[2] = miel;
        arregloComida[3] = pastelito;
        arregloComida[4] = huesoDeCarne;
        arregloComida[5] = pastillaDormir;
        arregloComida[6] = ajo;
        arregloComida[7] = ensalada;
        arregloComida[8] = enlatado;
        arregloComida[9] = pera;
        arregloComida[10] = chile;
        arregloComida[11] = chocolate;
        arregloComida[12] = sushi;
        arregloComida[13] = melon;
        arregloComida[14] = hongo;
        arregloComida[15] = pizza;
        arregloComida[16] = carne;
        arregloComida[17] = gelatina;
    }

    public void copiarTierComida(int cantidadDeComidaDesbloquado) {

        for (int i = 0; i < cantidadDeComidaDesbloquado; i++) {
            arregloMascotas[i] = nuevoTier[i];
        }
    }

}
