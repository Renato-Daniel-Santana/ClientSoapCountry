package br.fatec.client;

import java.rmi.RemoteException;
import br.fatec.services.CountryServiceCallbackHandler;
import br.fatec.services.CountryServiceStub;
import br.fatec.services.CountryServiceStub.Country;
import br.fatec.services.CountryServiceStub.GetCountryDetails;
import br.fatec.services.CountryServiceStub.GetCountryDetailsResponse;

public class ClientCountry extends CountryServiceCallbackHandler {

	public static void main(String[] args) throws RemoteException {
		CountryServiceStub service1 = new CountryServiceStub();
		GetCountryDetailsResponse countryResponse1 = new GetCountryDetailsResponse();
		GetCountryDetails countryCode = new GetCountryDetails();
		countryCode.setCountryCode("BR");
		countryResponse1 = service1.getCountryDetails(countryCode);
		Country country1 = countryResponse1.get_return();
		System.out.println("Código: " + country1.getCountryCode() + "\nPaís: " + country1.getName() + "\nCapital: " + country1.getCity());
	}
}