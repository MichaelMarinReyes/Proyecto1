package com.proyecto1.modosdejuego;

import com.proyecto1.animales.tier1.Hormiga;

/**
 *
 * @author michael
 */
public class Tier {

    public void desbloquarTierAnimales() {
        int ronda = 1;

        switch (ronda) {
            case 1:
                //  TIER 1
                Hormiga hormiga = new Hormiga(2, 1, " ", "Compañerismo", 1);
                hormiga.setTipo("Insecto", "Terrestre");
                /*Hormiga 2/1,
                compañerismo dar a aliado al azar (2/1)(4/2)(6/3)
                tipo insecto/terrestre */
                /*Pescado 2/3
                powerup dar a todos aliados (1/1)(2/2)
                tipo acuatico*/
                /* mosquito (2/2)
                piquete inicial daño -1 a (1)(2)(3) enemigos
                tipo volador*/
                /* grillo (1/2)
                zombificacion invocar a grillo con (1/1)(2/2)(3/3)
                tipo insecto*/
                /* castor 2/2
                represa da 2 aliados +1/+2/+3 al venderse
                terrestre/acuatico*/
                /*caballo 2/1
                rugido aliado da +1/+2/+3 a los aliados invocados
                tipo mamifero/domestico*/
                /*nutria 1/2
                ventaja economica da (1/1)(2/2)(3/3) al comprarse
                tipo mamifero*/
                /* escarabajo 2/3
                apetito otorga a la tienda 1/2/3 al comer de la tienda
                tipo insecto*/
                break;
            case 2:
                /*Sapo [3/3]
                Metamorfosis: Copia la salud del aliado más saludable. 
                Tipo: terrestre y acuático*/
                /*Dodo [2/3]
                División de poder: Da al aliado de adelante 50%/100%/150% ATK al iniciar la batalla. 
                Tipo volador*/
                /*Elefante: [3/5]
                Daño colateral: Inflige 1 daño a 1/2/3 amigos detrás antes de atacar
                Tipo mamífero y terrestre*/
                /*Puerco Espin [3/2]
                Espinas salvajes: Repartir 2/4/6 dmg a todas las mascotas al morir.
                Tipo solitario y terrestre*/
                /*Pavoreal [2/5]
                Potenciación: Gana 50% de ATK 1/ 2 / 3 veces al recibir daño.
                Tipo doméstico y volador*/
                /*Rata [4/5]
                Ayuda hipócrita: invoca 1/2/3 1/1 Dirty Rats al frente para el oponente al morir.
                Tipo terrestre y solitario*/
                /*Zorro: [5/2]
                Ataque Rápido: Ataca 2 veces seguidas cada (3 turnos)(2 turnos)(1 turno)
                Tipo solitario y terrestre*/
                /*Araña: [2/2]
                Liberación: invoca una mascota de nivel 1/2/3 de nivel 3 como 2/2 al morir. 
                Tipo insecto*/
                break;
            case 3:
                //Camello [2/5]
                //Joroba: Dar amigo detrás (+1/+2)/ (+2/+4) / (+3/+6).
                //Tipo mamífero/desértico
                //
                //Mapache [5/4]
                //Repartir poder: Otorga 1x/2x/3x ATK a las mascotas adyacentes al morir.
                //Tipo solitario
                //Jirafa [2/5]
                //Fortaleza aliada: Da 1/ 2 / 3 amigos por delante +1/+1 al finalizar el turno de compra.
                //Tipo mamífero/terrestre
                //Tortuga [1/2]
                //Protección aliada: Dar 1/2/3 amigos detrás de Melón Armor al morir.
                //Tipo reptil
                //Caracol [2/2]
                //Resurgir: si perdiste la última batalla, dales a todos los amigos (+1/+1)/ (+2/+2) / (+3/+3) al comprar
                //Tipo insecto/solitario
                //Oveja (Cabras) [2/2]
                //Revolución: invoca dos (2/2)/ (4/4) / (6/6) carneros al morir
                //Tipo doméstico/terrestre
                //Conejo [3/2]
                //Cariño: Cuando un amigo come comida de la tienda: Le da +1/ +2 / +3 HP.
                //Tipo mamífero
                //Lobo [3/4]
                //Aullido: Si es el último con vida gana (+2/+2)(+3,+3)(+5,+5) permanentemente.
                //Tipo solitario/terrestre
                //Buey [1/4]
                //Mejor me protejo: gana armadura de melón y +2/ +4/ + 6 ATK cuando la mascota aliada de delante se debilita.
                //Tipo mamífero
                //Canguro [1/2]
                //Ya quiero pelear: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) cada que la mascota aliada de delante ataque
                //Tipo mamífero/terrestre
                //Buho [5/3]
                //Suerte amigos: Dar un amigo al azar (+2/+2)/ (+4/+4) / (+6/+6) al vender.
                //Tipo volador/solitario
                break;
            case 4:
            //Venado (Camión) [1/1]
            //Venganza: Invoca un (5/5)/(10/10)/(15/15) autobus con Splash attack al morir.
            //Tipo mamífero
            //Loro [5/3]
            //Copia: al finalizar el turno de compra copia la habilidad del amigo de adelante como lvl 1/2/3 hasta el final de la batalla.
            //Tipo volador
            //Hipopótamo [4/7]
            //Robustez: Ganancia (+2/+2)/ (+4/+4) / (+6/+6) al ser él hipopotamo quien debilita a una mascota enemiga.
            //Tipo acuático/terrestre
            //Delfín [4/6]
            //Salpicón: reparte 5/10/15 de daño al enemigo con la salud más baja al comenzar la batalla.
            //Tipo: Acuático
            //Puma [3/7]
            //Sigilo: Al cabo de (3)(2)(1) turnos siendo dañado deja una copia de 1/1, mientras está la copia el puede atacar.
            //Tipo: Mamífero/Terrestre
            //Ballena [3/8]
            //Succión: Al iniciar la partida trague al aliado de delante y suéltalo como lvl 1/2/3 después de debilitarse.
            //Tipo: Acuático
            //Ardilla [2/5]
            //Rebajas: al iniciar el turno de compra realiza un descuento en la compra de alimentos por 1/2/3 de oro.
            //Tipo: Doméstico
            //Llama [3/6]
            //Fortaleza individual: al finalizar el turno de compra si tienes 4 mascotas o menos, gana (+2/+2)/ (+4/+4) / (+6/+6).
            //Tipo: Terrestre

                break;
            case 5:
            //Foca: [3/8]
            //Compartir poder: Al recibir comida de la tienda da a  2 amigos randoms (+1/+1)(+2/+2)/(+3/+3). 
            //Tipo: Acuático/Mamífero
            //Jaguar: [7/4]
            //Venganza felina: Si el que está delante es atacado, daña al que lo atacó por (5)(10)(15) de daño
            //Tipo: Mamífero/Terrestre
            //Escorpión: [1/1]
            //Aguja; tiene un ataque de veneno innato (el veneno ejecuta a la mascota enemiga sin importar cuánta vida tenga) .
            //Tipo: Desértico/Solitario
            //Rinoceronte: [5/8]
            //Estampida: Inflige 4/8/12 de daño al primer enemigo.
            //Tipo: Desértico/Terrestre
            //Mono: [1/2]
            //Turno final: 
            //Amistad: Dar al amigo más a la derecha (+2/+3)/ (+4/+6) / (+6/+9) .
            //Tipo: Mamífero
            //Cocodrilo: [8/4]
            //Mordida: (Comienzo de la batalla) inflige 8/16/24 de daño al último enemigo.
            //Tipo: Reptil/Solitario
            //Vaca: [4/6] 
            //Leche potenciadora: al comprar reemplaza la tienda de comida con leche gratis que da (+1/+2)/ (+2/+4) / (+3/+6) .
            //Mamífero/Terrestre
            //Chompipe: [3/4]
            //Solidaridad: Le da (+3/+3)/(+6/+6)/(+9/+9) a un aliado invocado.
            //Terrestre/Volador

                break;
            case 6:
            //Panda: [5/5]
            //Fortaleza: Absorbe el (50% / 60% / 80%) del daño recibido.
            //Mamífero/Solitario
            //Gato: [4/5]
            //Maullido: Multiplica el efecto HP y ATK de la comida por 2/3/4 .
            //Mamífero/Doméstico
            //Tigre: [4/3]
            //Repetición: El amigo de adelante repite su habilidad en la batalla como si fuera de nivel 1/2/3 .
            //Terrestre/Mamífero
            //Serpiente: [6/6]
            //Ataque discreto: inflige 5/10/15 de daño a un enemigo aleatorio cuando una mascota aliada de delante ataca.
            //Reptil/Terrestre/Desértico
            //Mamut: [3/10]
            //Fuerza compañeros: al desmayarse dará a todos los amigos (+2/+2)/ (+4/+4) / (+6/+6) .
            //Tipo: Mamífero/Terrestre/Solitario
            //leopardo: [10/4]
            //Zarpazo: al iniciar la batalla inflige 50 % de daño ATQ a 1/2/3 enemigos aleatorios .
            //Tipo: Mamífero/Terrestre
            //Gorila: [6/9]
            //Escudo: al recibir daño gana escudo de coco ( 1/2/3 veces por batalla).
            //Tipo: Mamífero/Terrestre
            //Pulpo: [8/8]
            //Habilidades por nivel
            //(1) Subir de nivel: Gana +8/8.
            //(2) Subir de nivel: gana +8/+8 y una nueva habilidad al azar.
            //(3) Antes del ataque: inflige 5 de daño a todos los enemigos.
            //Tipo: Acuático/Solitario
            //Mosca:[5/5]
            //Invocación: cuando un aliado se debilita invoca un (5/5)/ (10/10) / (15/15) Zombie Fly en su lugar (tres veces por batalla).
            //Tipo: Volador/Insecto

                break;
            case 7:
            //Quetzal [10/10]
            //Habilidades por nivel
            //(1) Agrega a su vida la suma de toda la vida de los animales tipos aves.
            //(2) Hace lo del nivel 1 y agrega a su daño la suma de todo el daño del daño de todas las aves.
            //(3) Hace lo del nivel 2 pero con todos los animales.
            //Tipo: Volador/Solitario
            //Camaleón [8/8] 
            //Habilidades por nivel
            //(1) Copia la vida del enemigo más fuerte
            //(2) Copia la vida y el daño del enemigo más fuerte
            //(3) Copia la vida, el daño y la habilidad del enemigo más fuerte
            //Tipo: Reptil/Solitario

                break;
            default:
                throw new AssertionError();
        }
    }
    
    public void desbloquarTierComida() {
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
                throw new AssertionError();
        }
    }
}
