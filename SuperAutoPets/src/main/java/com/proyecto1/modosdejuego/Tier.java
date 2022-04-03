package com.proyecto1.modosdejuego;

import com.proyecto1.dinamicajuego.OrdenamientoYBusqueda;
import com.proyecto1.alimentos.Ajo;
import com.proyecto1.alimentos.Carne;
import com.proyecto1.alimentos.Chile;
import com.proyecto1.alimentos.Chocolate;
import com.proyecto1.alimentos.Comida;
import com.proyecto1.alimentos.ComidaEnlatada;
import com.proyecto1.alimentos.Ensalada;
import com.proyecto1.alimentos.Gelatina;
import com.proyecto1.alimentos.Hongo;
import com.proyecto1.alimentos.HuesoDeCarne;
import com.proyecto1.alimentos.Manzana;
import com.proyecto1.alimentos.Melon;
import com.proyecto1.alimentos.Miel;
import com.proyecto1.alimentos.Naranja;
import com.proyecto1.alimentos.Pastel;
import com.proyecto1.alimentos.PastillaParaDormir;
import com.proyecto1.alimentos.Pera;
import com.proyecto1.alimentos.Pizza;
import com.proyecto1.alimentos.Sushi;
import com.proyecto1.mascotas.Mascota;
import com.proyecto1.mascotas.tier1.Caballo;
import com.proyecto1.mascotas.tier1.Castor;
import com.proyecto1.mascotas.tier1.Escarabajo;
import com.proyecto1.mascotas.tier1.Grillo;
import com.proyecto1.mascotas.tier1.Hormiga;
import com.proyecto1.mascotas.tier1.Mosquito;
import com.proyecto1.mascotas.tier1.Nutria;
import com.proyecto1.mascotas.tier1.Pescado;
import com.proyecto1.mascotas.tier2.Araña;
import com.proyecto1.mascotas.tier2.Dodo;
import com.proyecto1.mascotas.tier2.Elefante;
import com.proyecto1.mascotas.tier2.Pavoreal;
import com.proyecto1.mascotas.tier2.PuercoEspin;
import com.proyecto1.mascotas.tier2.Rata;
import com.proyecto1.mascotas.tier2.Sapo;
import com.proyecto1.mascotas.tier2.Zorro;
import com.proyecto1.mascotas.tier3.Buey;
import com.proyecto1.mascotas.tier3.Buho;
import com.proyecto1.mascotas.tier3.Camello;
import com.proyecto1.mascotas.tier3.Canguro;
import com.proyecto1.mascotas.tier3.Caracol;
import com.proyecto1.mascotas.tier3.Conejo;
import com.proyecto1.mascotas.tier3.Jirafa;
import com.proyecto1.mascotas.tier3.Lobo;
import com.proyecto1.mascotas.tier3.Mapache;
import com.proyecto1.mascotas.tier3.Oveja;
import com.proyecto1.mascotas.tier3.Tortuga;
import com.proyecto1.mascotas.tier4.Ardilla;
import com.proyecto1.mascotas.tier4.Ballena;
import com.proyecto1.mascotas.tier4.Delfin;
import com.proyecto1.mascotas.tier4.Hipopotamo;
import com.proyecto1.mascotas.tier4.Llama;
import com.proyecto1.mascotas.tier4.Loro;
import com.proyecto1.mascotas.tier4.Puma;
import com.proyecto1.mascotas.tier4.Venado;
import com.proyecto1.mascotas.tier5.Chompipe;
import com.proyecto1.mascotas.tier5.Cocodrilo;
import com.proyecto1.mascotas.tier5.Escorpion;
import com.proyecto1.mascotas.tier5.Foca;
import com.proyecto1.mascotas.tier5.Jaguar;
import com.proyecto1.mascotas.tier5.Mono;
import com.proyecto1.mascotas.tier5.Rinoceronte;
import com.proyecto1.mascotas.tier5.Vaca;
import com.proyecto1.mascotas.tier6.Gato;
import com.proyecto1.mascotas.tier6.Gorila;
import com.proyecto1.mascotas.tier6.Leopardo;
import com.proyecto1.mascotas.tier6.Mamut;
import com.proyecto1.mascotas.tier6.Mosca;
import com.proyecto1.mascotas.tier6.Panda;
import com.proyecto1.mascotas.tier6.Pulpo;
import com.proyecto1.mascotas.tier6.Serpiente;
import com.proyecto1.mascotas.tier6.Tigre;
import com.proyecto1.mascotas.tier7.Camaleon;
import com.proyecto1.mascotas.tier7.Quetzal;

/**
 *
 * @author michael
 */
public class Tier {

    private final int TAMAÑO_ANIMALES = 54;
    private final int TAMAÑO_COMIDA = 18;
    private final int CANTIDAD_COMIDA_MOSTRADA = 2;
    private int animalesMostradosPorRonda;
    private int comidaMostradaPorRonda;
    Mascota[] mascota = new Mascota[TAMAÑO_ANIMALES];
    Comida[] comida = new Comida[TAMAÑO_COMIDA];
    OrdenamientoYBusqueda ordenar = new OrdenamientoYBusqueda();

    public Mascota[] desbloquearTierMascota(int ronda) {
        mascota[0] = new Hormiga("Hormiga", 2, 1, 1, 1, "Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir");
        mascota[1] = new Pescado("Pescado", 2, 3, 1, 1, "Power - up: Da a todos los aliados(+1 / +1) / (+2 / +2) al subir de nivel");
        mascota[2] = new Mosquito("Mosquito", 2, 2, 1, 1, "Piquete inicial: Al iniciar batalla realiza 1 de daño a(1) / (2) / (3) enemigos");
        mascota[3] = new Grillo("Grillo", 1, 2, 1, 1, "Zombificación: Convoca a un grillo zombie con estadísticas: (1 / 1) / (2 / 2) / (3 / 3) al morir");
        mascota[4] = new Castor("Castor", 2, 2, 1, 1, "Represa: Da a 2 aliados al azar + 1 / +2 / +3 HP al venderse");
        mascota[5] = new Caballo("Caballo", 2, 1, 1, 1, "Rugido aliado: Da + 1 / +2 / +3 ATK a los aliados invocados");
        mascota[6] = new Nutria("Nutria", 1, 2, 1, 1, "Ventaja económica: Da a un aliado aleatorio(+1 / +1) / (+2 / +2) / (+3 / +3) al comprarse");
        mascota[7] = new Escarabajo("Escarabajo", 2, 3, 1, 1, "Apetito: Otorga a las mascotas de la tienda + 1 / +2 / +3 HP al comer comida de la tienda");
        mascota[8] = new Sapo("Sapo", 3, 3, 2, 1, "Metamorfosis: Copia la salud del aliado más saludable");
        mascota[9] = new Dodo("Dodo", 2, 3, 2, 1, "División de poder: Da al aliado de adelante 50%/100%/150% ATK al iniciar la batalla");
        mascota[10] = new Elefante("Elefante", 3, 5, 2, 1, "Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar");
        mascota[11] = new PuercoEspin("Puerco Espin", 3, 2, 2, 1, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
        mascota[12] = new Pavoreal("Pavoreal", 2, 5, 2, 1, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
        mascota[13] = new Rata("Rata", 4, 5, 2, 1, "Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir");
        mascota[14] = new Zorro("Zorro", 5, 2, 2, 1, "Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)");
        mascota[15] = new Araña("Araña", 3, 2, 2, 1, "Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir");
        mascota[16] = new Camello("Camello", 2, 5, 3, 1, "Joroba: Dar amigo detrás (+1/+2)/ (+2/+4) / (+3/+6)");
        mascota[17] = new Mapache("Mapache", 5, 4, 3, 1, "Repartir poder: Otorga 1x/2x/3x ATK a las mascotas adyacentes al morir");
        mascota[18] = new Jirafa("Jirafa", 2, 5, 3, 1, "Fortaleza aliada: Da 1/ 2 / 3 amigos por delante +1/+1 al finalizar el turno de compra");
        mascota[19] = new Tortuga("Tortuga", 1, 2, 3, 1, "Protección aliada: Dar 1/2/3 amigos detrás de Melón Armor al morir");
        mascota[20] = new Caracol("Caracol", 2, 2, 3, 1, "Resurgir: si perdiste la última batalla, dales a todos los amigos (+1/+1)/ (+2/+2) / (+3/+3) al comprar");
        mascota[21] = new Oveja("Oveja", 2, 2, 3, 1, "Revolución: invoca dos (2/2)/ (4/4) / (6/6) carneros al morir");
        mascota[22] = new Conejo("Conejo", 3, 2, 3, 1, "Cariño: Cuando un amigo come comida de la tienda: Le da +1/ +2 / +3 HP");
        mascota[23] = new Lobo("Lobo", 3, 4, 3, 1, "Aullido: Si es el último con vida gana (+2/+2)(+3,+3)(+5,+5) permanentemente");
        mascota[24] = new Buey("Buey", 1, 4, 3, 1, "Mejor me protejo: gana armadura de melón y +2/ +4/ + 6 ATK cuando la mascota aliada de delante se debilita");
        mascota[25] = new Canguro("Canguro", 1, 2, 3, 1, "Ya quiero pelear: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) cada que la mascota aliada de delante ataque");
        mascota[26] = new Buho("Buho", 5, 3, 3, 1, "Suerte amigos: Dar un amigo al azar (+2/+2)/ (+4/+4) / (+6/+6) al vender");
        mascota[27] = new Venado("Venado", 1, 1, 4, 1, "Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir");
        mascota[28] = new Loro("Loro", 5, 3, 4, 1, "Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl 1/2/3 hasta el final de la batalla");
        mascota[29] = new Hipopotamo("Hipopótamo", 4, 7, 4, 1, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
        mascota[30] = new Delfin("Delfin", 1, 2, 4, 1, "Salpicón: reparte 5/10/15 de daño al enemigo con la salud más baja al comenzar la batalla");
        mascota[31] = new Puma("Puma", 3, 7, 4, 1, "Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar");
        mascota[32] = new Ballena("Ballena", 3, 8, 4, 1, "Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después de debilitarse");
        mascota[33] = new Ardilla("Ardilla", 2, 5, 4, 1, "Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por 1/2/3 de oro");
        mascota[34] = new Llama("Llama", 3, 6, 5, 1, "Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana (+2/+2)/ (+4/+4) / (+6/+6)");
        mascota[35] = new Foca("Foca", 3, 8, 5, 1, "Compartir poder: Al recibir comida de la tienda da a  2 amigos randoms (+1/+1)(+2/+2)/(+3/+3)");
        mascota[36] = new Jaguar("Jaguar", 7, 4, 5, 1, "Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño");
        mascota[37] = new Escorpion("Escorpion", 1, 1, 5, 1, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
        mascota[38] = new Rinoceronte("Rinoceronte", 5, 8, 5, 1, "Estampida: Inflige 4/8/12 de daño al primer enemigo");
        mascota[39] = new Mono("Mono", 1, 2, 5, 1, "Amistad: Dar al amigo más a la derecha (+2/+3)/ (+4/+6) / (+6/+9)");
        mascota[40] = new Cocodrilo("Cocodrilo", 8, 4, 5, 1, "Mordida: (Comienzo de la batalla) inflige 8/16/24 de daño al último enemigo");
        mascota[41] = new Vaca("Vaca", 4, 6, 4, 1, "Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da (+1/+2)/ (+2/+4) / (+3/+6)");
        mascota[42] = new Chompipe("Chompipe", 3, 6, 5, 1, "Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado");
        mascota[43] = new Panda("Panda", 5, 5, 6, 1, "Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido");
        mascota[44] = new Gato("Gato", 4, 5, 6, 1, "Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4");
        mascota[45] = new Tigre("Tigre", 4, 3, 6, 1, "Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel 1/2/3");
        mascota[46] = new Serpiente("Serpiente", 6, 6, 6, 1, "Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca");
        mascota[47] = new Mamut("Mamut", 3, 10, 6, 1, "Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6)");
        mascota[48] = new Leopardo("Leopardo", 10, 4, 6, 1, "Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios");
        mascota[49] = new Gorila("Gorila", 6, 9, 6, 1, "Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla)");
        mascota[50] = new Pulpo("Pulpo", 8, 8, 6, 1, "Habilidades por nivel (1) Subir de nivel: Gana +8/8. (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar (3) Antes del ataque: inflige 5 de daño a todos los enemigos");
        mascota[51] = new Mosca("Mosca", 5, 5, 6, 1, "Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla)");
        mascota[52] = new Quetzal("Quetzal", 10, 10, 7, 1, "Habilidades por nivel (1) Agrega a su vida la suma de toda la vida de los animales tipos aves (2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves (3) Hace lo del nivel 2 pero con todos los animales");
        mascota[53] = new Camaleon("Camaleon", 8, 8, 7, 1, "Habilidades por nivel (1) Copia la vida del enemigo más fuerte (2) Copia la vida y el daño del enemigo más fuerte (3) Copia la vida, el daño y la habilidad del enemigo más fuerte");

// Tienda ronda 1, 2, 3, tier 1, tier 2
        if (ronda >= 1 && ronda <= 3) {
            if (ronda == 1 || ronda == 2) {
                //Tier 1
                animalesMostradosPorRonda = 8;
                for (int i = 0; i < 3; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);

                }
                return mascota;
            } else if (ronda == 3) {
                //Tier 2
                animalesMostradosPorRonda = 16;
                for (int i = 0; i < 3; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            }

// Tienda ronda 4, 5, 6, tier 4
        } else if (ronda >= 4 && ronda <= 6) {
            if (ronda == 4) {
                //Tier 2
                animalesMostradosPorRonda = 16;
                for (int i = 0; i < 4; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            } else if (ronda == 5 || ronda == 6) {
                //Tier 3
                animalesMostradosPorRonda = 27;
                int indice = (int) (Math.random() * animalesMostradosPorRonda);
                System.out.println(mascota[indice]);
            }
            return mascota;
        } else if (ronda >= 7) {
            if (ronda == 7 || ronda == 8) {
                //Tier 4
                animalesMostradosPorRonda = 35;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            } else if (ronda == 9 || ronda == 10) {
                //Tier 7
                animalesMostradosPorRonda = 43;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            } else if (ronda == 11 || ronda == 12) {
                //Tier 6
                animalesMostradosPorRonda = 52;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            } else if (ronda > 12) {
                //Tier 7
                animalesMostradosPorRonda = 54;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * animalesMostradosPorRonda);
                    System.out.println(mascota[indice]);
                }
                return mascota;
            }
        }
        return mascota;
    }

    public Comida[] desbloquerTierComida(int ronda) {
        comida[0] = new Manzana("Manzana", "Da 1 de vida y 1 de daño a un animal seleccionado", 1, 1);
        comida[1] = new Naranja("Naranja", "Efecto", "Hace que regrese un 10% de daño");
        comida[2] = new Miel("Miel", "Efecto", "Cuando la mascota a la que se le dio la miel muere, es remplazada con una abeja de 1 de vida y 1 de daño");
        comida[3] = new Pastel("Pastelito", "Da 3 de vida y 3 de daño por la siguiente ronda de pelea", 3, 3);
        comida[4] = new HuesoDeCarne("Hueso de Carne", "Efecto", "Da al animal 5 de daño extra", 0, 5);
        comida[5] = new PastillaParaDormir("Pastilla para dormir", "Hace que nuestra mascota se desmaye en la fase de menú entre batalla", 0, 0);
        comida[6] = new Ajo("Ajo", "Efecto", "Da armadura que hace que reciba 2 de daño menos", 2, 0);
        comida[7] = new Ensalada("Ensalada", "Da 1 de vida y 1 de daño a 2 animales aleatorios del equipo", 1, 1);
        comida[8] = new ComidaEnlatada("Comida enlatada", "Da a los animales que estan en la tienda y proximos que aparezcan 1 de vida y 2 de daño", 1, 2);
        comida[9] = new Pera("Pera", "Da al animal escogido 2 de vida y 2 de daño", 2, 2);
        comida[10] = new Chile("Chile", "Efecto", "Hace que el animal portador haga 5 de daño al animal que se encuentra detras del que atacó");
        comida[11] = new Chocolate("Chocolate", "Da 1 de experiencia a un animal de tu equipo", 0, 0);
        comida[12] = new Sushi("Sushi", "Da 1 de vida y 1 de daño a 3 animales aleatorios del equipo", 1, 1);
        comida[13] = new Melon("Melón", "Efecto", "El animal que lo porte no recibira daño la primera vez que sea atacado");
        comida[14] = new Hongo("Hongo", "Efecto", "Cuando el animal muere vuelve a aparecer con 1 de vida y 1 de daño");
        comida[15] = new Pizza("Pizza", "Da 2 de vida y 2 de daño a 2 animales aleatorios del equipo", 2, 2);
        comida[16] = new Carne("Carne", "Efecto", "Hace que el animal que lo porte haga 20 de daño adicional 1 vez por ronda", 0, 20);
        comida[17] = new Gelatina("Gelatina", "Efecto", "El animal que lo porte puede tener un tipo extra");

// Tienda ronda 1, 2, 3, tier 1, tier 2
        if (ronda >= 1 && ronda <= 3) {
            if (ronda == 1 || ronda == 2) {
                //Tier 1
                comidaMostradaPorRonda = 3;
                for (int i = 0; i < CANTIDAD_COMIDA_MOSTRADA; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            } else if (ronda == 3) {
                //Tier 2
                comidaMostradaPorRonda = 6;
                for (int i = 0; i < CANTIDAD_COMIDA_MOSTRADA; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            }

// Tienda ronda 4, 5, 6, tier 4
        } else if (ronda >= 4 && ronda <= 6) {
            if (ronda == 4) {
                //Tier 2
                comidaMostradaPorRonda = 6;
                for (int i = 0; i < CANTIDAD_COMIDA_MOSTRADA; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            } else if (ronda == 5 || ronda == 6) {
                //Tier 3
                comidaMostradaPorRonda = 10;
                for (int i = 0; i < CANTIDAD_COMIDA_MOSTRADA; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
            }
            return comida;
        } else if (ronda >= 7) {
            if (ronda == 7 || ronda == 8) {
                //Tier 4
                comidaMostradaPorRonda = 13;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            } else if (ronda == 9 || ronda == 10) {
                //Tier 5
                comidaMostradaPorRonda = 15;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            } else if (ronda == 11 || ronda == 12) {
                //Tier 6
                comidaMostradaPorRonda = 17;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            } else if (ronda > 12) {
                //Tier 7
                comidaMostradaPorRonda = 18;
                for (int i = 0; i < 5; i++) {
                    int indice = (int) (Math.random() * comidaMostradaPorRonda);
                    System.out.println(comida[indice]);
                }
                return comida;
            }
        }
        return comida;
    }
}
