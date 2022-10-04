import java.io.File;

public class Ficheros {
    public static void main(String[] args) throws Exception {
        String dir = ".";
        File f = new File(dir);
        String[] archivos = f.list();
        System.out.println("Ficheros del directorio actual: " + archivos.length);

        for (int i = 0; i < archivos.length; i++) {
            File f2 = new File(f, archivos[i]);

            System.out.println("-----------------------------------");
            System.out.println("ORDEN:"+ i+1 +" Nombre: " + archivos[i]+ ", es fichero? "+ f2.isFile()+ " es directiorio? "+ f2.isDirectory());
            System.out.println("Se puede leer : " + f2.canRead());
            System.out.println("se puede escribir : " + f2.canWrite());
            System.out.println("Nombre del fichero : " + f2.getName());
            System.out.println("Ruta : "+ f2.getPath());
            System.out.println("Ruta absoluta : " + f2.getAbsolutePath());
            System.out.println("Tamanio : " + f2.length());
            System.out.println("Es un directorio : " + f2.isDirectory());
            System.out.println("Es un fichero : " + f2.isFile());
            System.out.println("Directorio padre : " + f2.getParentFile());
        }
    }
}
