package javacore.chapter02.condition.exercice;

public class FlightReservationValidator {

    public static void main(String[] args) {

        int passengerAge = 25;
        boolean isInternationalFlight = true;
        boolean hasVisa = false;
        boolean hasReturnTicket = true;
        int luggageWeight = 20;
        int availableSeats = 5;
        int returnTicketValidity = 30; // en jours
        String seatPreference = "fenêtre";
        String servicePreference = "repas chaud";

        if (passengerAge < 18) {
            System.out.println("Réservation refusée : vous devez avoir au moins 18 ans pour réserver un vol.");
        } else if (isInternationalFlight && !hasVisa) {
            if (isInternationalFlight) {
                System.out.println("Réservation refusée : vous devez avoir un visa pour réserver un vol international.");
            } else {
                System.out.println("Réservation refusée : vous devez avoir un visa pour réserver ce vol.");
            }
        } else if (!hasReturnTicket) {
            System.out.println("Réservation refusée : vous devez avoir un billet de retour pour réserver un vol.");
        } else if (returnTicketValidity < 30) {
            System.out.println("Réservation refusée : votre billet de retour n'est pas valide pour les 30 prochains jours.");
        } else if (availableSeats == 0) {
            System.out.println("Réservation refusée : il n'y a plus de sièges disponibles sur ce vol.");
        } else if (luggageWeight > 15) {
            System.out.println("Réservation acceptée, mais attention : votre bagage est trop lourd, des frais supplémentaires de 50€ seront appliqués.");
        } else {
            String seatMessage = "";
            String serviceMessage = "";

            if (seatPreference.equals("fenêtre")) {
                seatMessage = "siège fenêtre";
            } else if (seatPreference.equals("couloir")) {
                seatMessage = "siège couloir";
            } else {
                seatMessage = "siège standard";
            }

            if (servicePreference.equals("repas chaud")) {
                serviceMessage = "repas chaud";
            } else if (servicePreference.equals("repas froid")) {
                serviceMessage = "repas froid";
            } else {
                serviceMessage = "boisson et collation";
            }

            System.out.println("Réservation acceptée avec " + seatMessage + " et " + serviceMessage + " !");
        }
    }
}
