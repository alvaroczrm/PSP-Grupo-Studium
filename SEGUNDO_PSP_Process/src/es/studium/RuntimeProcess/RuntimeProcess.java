package es.studium.RuntimeProcess;
import java.io.IOException;
import java.util.Arrays;
public class RuntimeProcess
{
public static void main(String[] args) throws InterruptedException
{
if (args.length <= 0)
{
System.err.println("Se necesita un programa a ejecutar");
System.exit(-1);
}
try
{
	for (String pro : args) {
System.out.println("Ejecutando " + Arrays.toString(args));
// Otra forma de crear un proceso
Runtime runtime = Runtime.getRuntime();
Process process = runtime.exec(pro);
// Esperar 3 segundos...
Thread.sleep(3000);
System.out.println("Destruyendo " + Arrays.toString(args));
process.destroy();
	}
}
catch (IOException ex)
{
System.err.println("Excepción de E/S!!");
System.exit(-1);
}
}
}                                        