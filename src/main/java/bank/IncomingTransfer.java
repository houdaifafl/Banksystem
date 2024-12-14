package bank;

import bank.Exceptions.TransactionAttributeException;

/**
 *IncomingTransfer soll im Kontext von IncomingÜberweisungen verwendet werden.
 */
public class IncomingTransfer extends Transfer implements CalculateBill {
    /**
     *
     * @param date Das Datum des Vorgangs.
     * @param amount  Betrag des Vorgangs.
     * @param description Die Beschreibung des Vorgangs.
     * @throws TransactionAttributeException
     */
    public IncomingTransfer(String date, double amount, String description) throws TransactionAttributeException {
        super(date, amount, description);
    }

    /**
     *
     @param date Das Datum des Vorgangs.
      * @param amount Betrag des Vorgangs.
     * @param description Die Beschreibung des Vorgangs.
     * @param sender Der Absender.
     * @param recipient Der Empfänger.
     * @throws TransactionAttributeException
     */
    public IncomingTransfer(String date, double amount, String description, String sender, String recipient) throws TransactionAttributeException {
        this(date, amount, description);
        setSender(sender);
        setRecipient(recipient);
    }

    /**
     * Gibt den Betrag ohne eingehenden  Zinsen zurück.
     *
     * @return ein double, der den neuen Betrag darstellt.
     */
    @Override
    public double calculate()
    {
        return super.calculate();
    }
}
