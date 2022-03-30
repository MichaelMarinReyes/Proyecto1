package com.proyecto1.modosdejuego;

import com.proyecto1.animales.Mascota;
import com.proyecto1.jugadores.Usuario;

/**
 *
 * @author michael
 */
public class Tier {

    Mascota[] nuevoTier;
    
//    Tienda tienda = new Tienda();
    OrdenamientoYBusqueda ordenar = new OrdenamientoYBusqueda();

    public Mascota[] combinarTierAnteriorYDesbloqueado(Mascota[] tierRondaAnterior, Mascota[] tierRondaSiguiente) {
        int valor = 8;
        int posicionParaMostrar = 0;;

        for (int i = 0; i < nuevoTier.length; i++) {
            nuevoTier[posicionParaMostrar] = tierRondaAnterior[i];
            posicionParaMostrar++;
            nuevoTier[posicionParaMostrar] = tierRondaAnterior[i];
            posicionParaMostrar++;
        }

        return nuevoTier;
    }


    public void desbloquarTierAnimales(int ronda) {
        Mascota[] tier = new Mascota[8];
        if (ronda == 1 && ronda == 2) {
            Mascota hormiga = new Mascota("Hormiga", 2, 1, "Da a un aliado al azar (+2/+1)/(+4/+2)/(+6/+3) al morir");
            Mascota pescado = new Mascota("Pescado", 2, 3, "Power - up: Da a todos los aliados(+1 / +1) / (+2 / +2) al subir de nivel");
            Mascota mosquito = new Mascota("Mosquito", 2, 2, "Piquete inicial: Al iniciar batalla realiza 1 de daño a(1) / (2) / (3) enemigos");
            Mascota grillo = new Mascota("Grillo", 1, 2, "Zombificación: Convoca a un grillo zombie con estadísticas: (1 / 1) / (2 / 2) / (3 / 3) al morir");
            Mascota castor = new Mascota("Castor", 2, 2, "Represa: Da a 2 aliados al azar + 1 / +2 / +3 HP al venderse");
            Mascota caballo = new Mascota("Caballo", 2, 1, "Rugido aliado: Da + 1 / +2 / +3 ATK a los aliados invocados");
            Mascota nutria = new Mascota("Nutria", 1, 2, "Ventaja económica: Da a un aliado aleatorio(+1 / +1) / (+2 / +2) / (+3 / +3) al comprarse");
            Mascota escarabajo = new Mascota("Escarabajo", 2, 3, "Apetito: Otorga a las mascotas de la tienda + 1 / +2 / +3 HP al comer comida de la tienda");

            tier[0] = hormiga;
            tier[1] = pescado;
            tier[2] = mosquito;
            tier[3] = grillo;
            tier[4] = castor;
            tier[5] = caballo;
            tier[6] = nutria;
            tier[7] = escarabajo;
            
            nuevoTier = tier;
            
            
            
            int indice = ((int) Math.random()* 7);
            
            

        } else if (ronda == 3 && ronda == 4) {
            Mascota[] tier2 = new Mascota[8];
            Mascota sapo = new Mascota("Sapo", 3, 3, "Metamorfosis: Copia la salud del aliado más saludable");
            Mascota dodo = new Mascota("Dodo", 2, 3, "División de poder: Da al aliado de adelante 50%/100%/150% ATK al iniciar la batalla");
            Mascota elefante = new Mascota("Elefante", 3, 5, "Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar");
            Mascota puercoEspin = new Mascota("Puerco Espin", 3, 2, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
            Mascota pavoreal = new Mascota("Pavoreal", 2, 5, "Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir");
            Mascota rata = new Mascota("Rata", 4, 5, "Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir");
            Mascota zorro = new Mascota("Zorro", 5, 2, "Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)");
            Mascota araña = new Mascota("Araña", 3, 2, "Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir");

            tier2[0] = sapo;
            tier2[1] = dodo;
            tier2[2] = elefante;
            tier2[3] = puercoEspin;
            tier2[4] = pavoreal;
            tier2[5] = rata;
            tier2[6] = zorro;
            tier2[7] = araña;

            nuevoTier = this.combinarTierAnteriorYDesbloqueado(tier, tier2);
            

        } else if (ronda == 5 && ronda == 6) {
            Mascota[] tier3 = new Mascota[11];
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

            tier3[0] = camello;
            tier3[1] = mapache;
            tier3[2] = jirafa;
            tier3[3] = tortuga;
            tier3[4] = caracol;
            tier3[5] = oveja;
            tier3[6] = conejo;
            tier3[7] = lobo;
            tier3[8] = buey;
            tier3[9] = canguro;
            tier3[10] = buho;
            nuevoTier = this.combinarTierAnteriorYDesbloqueado(nuevoTier, tier3);

        } else if (ronda == 7 && ronda == 8) {
            Mascota[] tier4 = new Mascota[8];
            Mascota venado = new Mascota("Venado", 1, 1, "Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir");
            Mascota loro = new Mascota("Loro", 5, 3, "Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl 1/2/3 hasta el final de la batalla");
            Mascota hipopotamo = new Mascota("Hipopótamo", 4, 7, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
            Mascota delfin = new Mascota("Delfin", 1, 2, "Salpicón: reparte 5/10/15 de daño al enemigo con la salud más baja al comenzar la batalla");
            Mascota puma = new Mascota("Puma", 3, 7, "Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar");
            Mascota ballena = new Mascota("Ballena", 3, 8, "Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después de debilitarse");
            Mascota ardilla = new Mascota("Ardilla", 2, 5, "Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por 1/2/3 de oro");
            Mascota llama = new Mascota("Llama", 3, 6, "Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana (+2/+2)/ (+4/+4) / (+6/+6)");

            tier4[0] = venado;
            tier4[1] = loro;
            tier4[2] = hipopotamo;
            tier4[3] = delfin;
            tier4[4] = puma;
            tier4[5] = ballena;
            tier4[6] = ardilla;
            tier4[7] = llama;
            nuevoTier = this.combinarTierAnteriorYDesbloqueado(nuevoTier, tier4);

        } else if (ronda == 9 && ronda == 10) {
            Mascota[] tier5 = new Mascota[8];
            Mascota foca = new Mascota("Foca", 3, 8, "Compartir poder: Al recibir comida de la tienda da a  2 amigos randoms (+1/+1)(+2/+2)/(+3/+3)");
            Mascota jaguar = new Mascota("Jaguar", 7, 4, "Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño");
            Mascota escorpion = new Mascota("Escorpion", 1, 1, "Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga");
            Mascota rinoceronte = new Mascota("Rinoceronte", 5, 8, "Estampida: Inflige 4/8/12 de daño al primer enemigo");
            Mascota mono = new Mascota("Mono", 1, 2, "Amistad: Dar al amigo más a la derecha (+2/+3)/ (+4/+6) / (+6/+9)");
            Mascota cocodrilo = new Mascota("Cocodrilo", 8, 4, "Mordida: (Comienzo de la batalla) inflige 8/16/24 de daño al último enemigo");
            Mascota vaca = new Mascota("Vaca", 4, 6, "Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da (+1/+2)/ (+2/+4) / (+3/+6)");
            Mascota chompipe = new Mascota("Chompipe", 3, 6, "Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado");

            tier5[0] = foca;
            tier5[1] = jaguar;
            tier5[2] = escorpion;
            tier5[3] = rinoceronte;
            tier5[4] = mono;
            tier5[5] = cocodrilo;
            tier5[6] = vaca;
            tier5[7] = chompipe;
            nuevoTier = this.combinarTierAnteriorYDesbloqueado(nuevoTier, tier5);

        } else if (ronda == 11 && ronda == 12) {
            Mascota[] tier6 = new Mascota[9];
            Mascota panda = new Mascota("Panda", 5, 5, "Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido");
            Mascota gato = new Mascota("Gato", 4, 5, "Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4");
            Mascota tigre = new Mascota("Tigre", 4, 3, "Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel 1/2/3");
            Mascota serpiente = new Mascota("Serpiente", 6, 6, "Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca");
            Mascota mamut = new Mascota("Mamut", 3, 10, "Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6)");
            Mascota leopardo = new Mascota("Leopardo", 10, 4, "Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios");
            Mascota gorila = new Mascota("Gorila", 6, 9, "Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla)");
            Mascota pulpo = new Mascota("Pulpo", 8, 8, "Habilidades por nivel (1) Subir de nivel: Gana +8/8. (2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar (3) Antes del ataque: inflige 5 de daño a todos los enemigos");
            Mascota mosca = new Mascota("Mosca", 5, 5, "Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla)");

            tier6[0] = panda;
            tier6[1] = gato;
            tier6[2] = tigre;
            tier6[3] = serpiente;
            tier6[4] = mamut;
            tier6[5] = leopardo;
            tier6[6] = gorila;
            tier6[7] = pulpo;
            tier6[8] = mosca;
            nuevoTier = this.combinarTierAnteriorYDesbloqueado(nuevoTier, tier6);

        } else if (ronda > 12) {
            Mascota[] tier7 = new Mascota[2];
            Mascota quetzal = new Mascota("Quetzal", 10, 10, "Habilidades por nivel (1) Agrega a su vida la suma de toda la vida de los animales tipos aves (2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves (3) Hace lo del nivel 2 pero con todos los animales");
            Mascota camaleon = new Mascota("Camaleon", 8, 8, "Habilidades por nivel (1) Copia la vida del enemigo más fuerte (2) Copia la vida y el daño del enemigo más fuerte (3) Copia la vida, el daño y la habilidad del enemigo más fuerte");

            tier7[0] = quetzal;
            tier7[1] = camaleon;
            nuevoTier = this.combinarTierAnteriorYDesbloqueado(nuevoTier, tier7);
        }
    }

    public void desbloquarTierComida(int ronda) {
        int tier = 0;

        switch (tier) {
            case 1:
                //Manzana: Da 1 de vida y 1 de daño a un animal seleccionado.
                //Naranja: Es tipo efecto, hace que regrese un 10% de daño
                //Miel: Es tipo efecto, donde hace que durante las rondas de pelea, cuando se muera la mascota que se le dió, invoca una abeja que tiene 1 de vida y 1 de daño (Efecto relacionado: Miel de abeja).

                break;
            case 2:
                //pastelito: Da 3 de vida y 3 de daño solo por la siguiente ronda de pelea.
                //Hueso de carne: Es tipo efecto, y le da al animal entregado 5 de daño extra durante los turnos de pelea (Efecto relacionado: Ataque de hueso).
                //Pastilla para dormir: Hace que nuestro animal se desmaye durante la fase de compras. (Todo efecto que un animal haga al desmayarse hará permanentemente)
                break;
            case 3:
                //Ajo: Es tipo efecto, y le da al animal entregado una armadura que hace que el animal entregado reciba 2 de daño menos (sí o sí recibe 1 de daño si es atacado) (Efecto relacionado: Armadura de ajo).
                //Ensalada: Da 1 de vida y 1 de daño a 2 animales aleatorios de tu equipo.
                //Comida enlatada: Da a los animales de la tienda y todos los próximos que aparezcan 2 de daño y 1 de vida extra.
                //Pera: Le da a un animal que se escoja 2 de vida y 2 de daño.
                break;
            case 4:
                //Chile: Es tipo efecto, y hace que el animal que lo porta haga 5 de daño al animal que se encuentra detrás del que atacó (Efecto relacionado: ataque demoledor).
                //Chocolate: Da +1 de experiencia a un animal de tu equipo.
                //Sushi: Da 1 de vida y 1 de ataque a 3 animales aleatorios de tu equipo.

                break;
            case 5:
                //Melón: Es tipo efecto, y hace que el animal que lo porta la primera vez que sea atacado no reciba daño, solo 1 uso por ronda (Efecto relacionado: Armadura de melón).
                //Hongo: Es tipo efecto, Da 1 vida extra al animal solo que sale con 1 de vida y 1 de daño (Efecto relacionado: Vida extra).

                break;
            case 6:
                //Pizza: Da 2 de vida y 2 de daño a 2 animales randoms de tu equipo.
                //Carne: Es tipo efecto, y hace que el animal que lo porté haga 20 de daño adicional una vez por ronda (Efecto relacionado: Ataque de carne) .

                break;
            case 7:
                //Gelatina: Es tipo efecto, y hace que el animal que lo porté tenga un tipo extra que escoge el jugador.
                break;
            default:
        }
    }
}
