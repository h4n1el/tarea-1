public class CuentaBanco
{
    public String titular;
    public double balance;

    public CuentaBanco(String Titular, double BalanceInicial)
    {
        this.titular = Titular;
        if(BalanceInicial >= 0)
        {
            this.balance = BalanceInicial;
        } else 
        {
            this.balance = 0;
        }

     
    }
    public void Depositar(double monto)
    {
        if(monto > 0)
        {
            System.out.println("el deposito ha sido un exito: " + monto);
        }else 
        {
            System.out.println("error, el monto debe ser mayor a 0");
        }
    }
    public void RetirarMonto(double monto)
    {
        if(monto >= 0 && monto <= this.balance)
        {
            this.balance -= monto;
            System.out.println("el retiro fue exitoso");
        } else if(monto > this.balance)
        {
            System.out.println("fondos insificientes");
        }else 
        {
            System.out.println("error el monto debe sermayor a 0");
        }
    }
    public String getTitular() { return titular; }
    public double getBalance() { return balance; }
}