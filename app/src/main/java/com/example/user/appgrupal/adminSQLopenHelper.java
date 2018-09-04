package com.example.user.appgrupal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class adminSQLopenHelper extends SQLiteOpenHelper {



    public adminSQLopenHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }
    @Override
    public void onCreate(SQLiteDatabase BaseDeDatos) {
        BaseDeDatos.execSQL
                ("create table Empleado(NDocumento text primary key, Nombre text, Apellido text, Categoria text, Profesion text,Direccion text, Telefono text, Email text, FechaN text, Nfoto text)");
        BaseDeDatos.execSQL("insert into Empleado(NDocumento, Nombre, Apellido, Categoria, Profesion, Direccion, Telefono, Email, FechaN, Nfoto)" +
                "values  ('1000000001','Javier Ignacio',' Molina Cano','Servicios','servicio de limpieza','p','3134066483','p','p','uno' )," +

                "('1000000002','Lillian Eugenia','Gómez Álvarez','Productos','Productos de carpinteria','p','3209332147','p','p','dos')," +

                "('1000000003','Gerardo Emilio','Naranjo Marín','Productos Alimenticios','vendedor de postres','p','3142361396','p','p','p')," +

                "('1000000004','Gloria Ampar','Duque Gutiérrez','Servicios','servicio de entretenimiento','p','3118444905','p','p','p')," +
                "('1000000005','Jhony Alberto','Sáenz Hurtado','Productos','vendedor de ropa','p','3112301618','p','p','p')," +
                "('1000000006','Beatriz Elena','Lotero Upegui','Productos Alimenticios','vendedor de frutas y/o verduras','p','3203888393','p','p','p')," +
                "('1000000007','Germán Antonio','Murillo González','Servicios','servicios de acarreo','p','3222399572','p','p','p')," +
                "('1000000008','Gloria Elena','Osorno Gil ','Productos','vendedores de productos varios','p','3226357453','p','p','p')," +
                "('1000000009','Oscar Darío','Palacio Martínez','Productos Alimenticios','vendedor de comida rapida','p','3138234398','p','p','p')," +
                "('1000000010','Maria Isabel ','Alzate Agudelo','Servicios','servicio de limpieza','p','3209332147','p','p','p')," +
                "('1000000011','Augusto Osorno','González Castaño','Productos','Productos de carpinteria','p','3123124898','p','p','p')," +
                "('1000000012','Maria Victoria','Osorio Laverde','Productos Alimenticios','vendedor de postres','p','3203872427','p','p','p')," +
                "('1000000013','César Oswaldo','Correa Ramírez','Servicios','servicio de entretenimiento','p','3143377605','p','p','p')," +
                "('1000000014','Beatriz Elena','Montoya Serna','Productos','vendedor de ropa','p','3118444905','p','p','p')," +
                "('1000000015','Héctor Iván','Augusto Giraldo','Productos Alimenticios','vendedor de frutas y/o verduras','p','3209332147','p','p','p')," +
                "('1000000016','Karen','Tabares Mora','Servicios','servicios de acarreo','p','3209332147','p','p','p')," +
                "('1000000017','Carlos Mario','Ramírez Vásquez','Productos','vendedores de productos varios','p','3143377605','p','p','p')," +
                "('1000000018','Yessica','Lopez Tobón','Productos Alimenticios','vendedor de comida rapida','p','3134066483','p','p','p')," +
                "('1000000019','Herman','Sanclemente Zea','Servicios','servicio de limpieza','p','3143377605','p','p','p')," +
                "('1000000020','Liliana',' Villegas Lopera','Productos','Productos de carpinteria','p','3143377605','p','p','p')," +
                "('1000000021','Carlos','Uribe Botero ','Productos Alimenticios','vendedor de postres','p','3118444905','p','p','p')," +
                "('1000000022','Ana Daniela','López Gaviria','Servicios','servicio de entretenimiento','p','3143377605','p','p','p')," +
                "('1000000023','Arturo','Tobón Tobón','Productos','vendedor de ropa','p','3143377605','p','p','p')," +
                "('1000000024','Monica','Mosquera Benítez','Productos Alimenticios','vendedor de frutas y/o verduras','p','3143377605','p','p','p')," +
                "('1000000025','William de J','Berdugo López','Servicios','servicios de acarreo','p','3143377605','p','p','p')," +
                "('1000002025','Karent Dayana','Zárate Yépez','Productos','vendedores de productos varios','p','3134066483','p','p','p')," +
                "('1000000026','Jaime Lopez','Hurtado Pérez','Productos Alimenticios','vendedor de comida rapida','p','3143377605','p','p','p')," +
                "('1000000027','Camila','Ruiz Ruiz','Servicios','servicio de limpieza','p','3209332147','p','p','p')," +
                "('1000000028','Carlos Alberto','Duque García ','Productos','Productos de carpinteria','p','3222399572','p','p','p')," +
                "('1000000029','Laura','Muñoz Ramírez','Productos Alimenticios','vendedor de postres','p','3203888393','p','p','p')," +
                "('1000000030','Jorge Uribe','Díaz Pérez','Servicios','servicio de entretenimiento','p','3222399572','p','p','p')," +
                "('1000000031','Maria Isabel','Rodas Monsalve','Productos','vendedor de ropa','p','3203888393','p','p','p')," +
                "('1000000032','Alfredo','Jiménez Gómez','Productos Alimenticios','vendedor de frutas y/o verduras','p','3143758526','p','p','p')," +
                "('1000000033','Héctor Damián','Zapata Suárez','Servicios','servicios de acarreo','p','3123506643','p','p','p')," +
                "('1000000034','Xiomara','Posada Vera ','Productos','vendedores de productos varios','p','3123506643','','','')," +
                "('1000000035','Álvaro Iván','Vélez Osorio','Productos Alimenticios','vendedor de comida rapida','l','3123506643','l','l','l')," +
                "('1000000036','Gabriela','Moreno Correa','Servicios','servicio de limpieza','l','3118444905','l','l','l')," +
                "('1000000037','Carlos Alberto','Alzate Garcés','Productos','Productos de carpinteria','l','3209332147','l','l','l')," +
                "('1000000038','Vanessa','Aguilar Gómez','Productos Alimenticios','vendedor de postres','l','3118444905','l','l','l')," +
                "('1000000039','Hernán Darío','Correa Silva','Servicios','servicio de entretenimiento','l','3123506643','l','l','l')," +
                "('1000000040','Laura Camila','Rodríguez Vallejo','Productos','vendedor de ropa','l','3203888393','l','l','l')," +
                "('1000000041','Jorge León','Gómez Giraldo','Productos Alimenticios','vendedor de frutas y/o verduras','l','3185230241','l','l','l')," +
                "('1000000042','Sol anjela','López Gaviria','Servicios','servicios de acarreo','l','3209219894','l','l','l')," +
                "('1000000043','John Jairo','Manuel Pineda','Productos','vendedores de productos varios','l','3209219894','l','l','l')," +
                "('1000000044','Damaris','Arias Gómez','Productos Alimenticios','vendedor de comida rapida','l','3209219894','l','l','l')," +
                "('1000000045','Armid Benjamín','Escobar Trujillo','Servicios','servicio de limpieza','l','3209219894','l','l','l')," +
                "('1000000046','Paula','Giraldo Morales','Productos','Productos de carpinteria','l','3209219894','l','l','l')," +
                "('1000000047','Elkin Octavio','Cárdenas Moreno','Productos Alimenticios','vendedor de postres','l','3203888393','l','l','l')," +
                "('1000000048','Erika','Castro Hernández','Servicios','servicio de entretenimiento','l','3185230241','l','l','l')," +
                "('1000000049','Julio Cesar','Rodríguez Monsalve','Productos','vendedor de ropa','l','3185230241','l','l','l')," +
                "('1000000050','Rosa','Saldarriaga Vásquez','Productos Alimenticios','vendedor de frutas y/o verduras','l','3123506643','l','l','l')," +
                "('1000000051','Gabriel Jaime','Sepúlveda Villada','Servicios','servicios de acarreo','l','3143758526','l','l','l')," +
                "('1000000052','Helen','Puerta Bolívar','Productos','vendedores de productos varios','l','3143758526','l','l','l')," +
                "('1000000053','José Didier','Arrubla Ortiz','Productos Alimenticios','vendedor de comida rapida','l','3209219894','l','l','l')," +
                "('1000000054','Angie','Bocanumenth Puerta ','Servicios','servicio de limpieza','l','3185230241','l','l','l')," +
                "('1000000055','Bernardo','Florez García ','Productos','Productos de carpinteria','l','3143758526','l','l','l')," +
                "('1000000056','Lizet','Bermúdez Saldarriaga','Productos Alimenticios','vendedor de postres','l','3185230241','l','l','l')," +
                "('1000000057','Luis Guillermo','Sandoval López','Servicios','servicio de entretenimiento','l','3143758526','l','l','l')," +
                "('1000000058','Gabriela','Contreras Fernandez ','Productos','vendedor de ropa','l','3185230241','l','l','l')," +
                "('1000000059','Horacio Augusto ','Diaz Hernandez ','Productos Alimenticios','vendedor de frutas y/o verduras','s','3185230241','s','s','s')," +
                "('1000000060','Laura','Vasquez Gutierrez ','Servicios','servicios de acarreo','s','3143758526','s','s','s')," +
                "('1000000061','Alejandro','Frias Ramirez ','Productos','vendedores de productos varios','s','3143758526','s','s','s')," +
                "('1000000062','Nicol','Cruz Estrada ','Productos Alimenticios','vendedor de comida rapida','s','3222399572','s','s','s')," +
                "('1000000063','Adolfo León','Ponce Sandoval ','Servicios','servicio de limpieza','s','3112301618','s','s','s')," +
                "('1000000064','Sarah','Vidal Reyes','Productos','Productos de carpinteria','s','3203888393','s','s','s')," +
                "('1000000065','Javier Ignacio','Cárdenas Sanchez ','Productos Alimenticios','vendedor de postres','s','3222399572','s','s','s')," +
                "('1000000066','Tatiana','Zárate Garcia','Servicios','servicio de entretenimiento','s','3185230241','s','s','s')," +
                "('1000000067','Gustavo Hernán','Diaz Diaz','Productos','vendedor de ropa','s','3123506643','s','s','s')," +
                "('1000000068','Natalia','Monroy Fernandez ','Productos Alimenticios','vendedor de frutas y/o verduras','s','3123506643','s','s','s')," +
                "('1000000069','Oscar Darío','Cardenas diaz','Servicios','servicios de acarreo','s','3123506643','s','s','s')," +
                "('1000000070','Leidy','Fritas Garcia','Productos','vendedores de productos varios','s','3123506643','s','s','s')," +
                "('1000000071','Gonzalo','Bonilla montaña','Productos Alimenticios','vendedor de comida rapida','s','3143758526','s','s','s')," +
                "('1000000072','Maria Fernanda','Lopez montes','Servicios','servicio de limpieza','s','3143758526','s','s','s')," +
                "('1000000073','Héctor','Garcia serna','Productos','Productos de carpinteria','s','3112301618','s','s','s')," +
                "('1000000074','Britany','Velez serna','Productos Alimenticios','vendedor de postres','s','3222399572','s','s','s')," +
                "('1000000075','Luis Alfonso','Ramirez rueda','Servicios','servicio de entretenimiento','s','3112301618','s','s','s')," +
                "('1000000076','Alejandra','Ozorio Real','Productos','vendedor de ropa','s','3222399572','s','s','s')," +
                "('1000000077','Luis Oliverio','Martines gomez','Productos Alimenticios','vendedor de frutas y/o verduras','s','3112301618','s','s','s')," +
                "('1000000078','Dayana','Gomez serna','Servicios','servicios de acarreo','s','3112301618','s','s','s')," +
                "('1000000079','Luis Fernando','Montaña Villada','Productos','vendedores de productos varios','s','3203888393','s','s','s')," +
                "('1000000080','Ana','Lopez Ramirez','Productos Alimenticios','vendedor de comida rapida','s','3203888393','s','s','s')");
    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
