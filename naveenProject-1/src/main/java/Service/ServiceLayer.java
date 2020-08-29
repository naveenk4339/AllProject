package Service;
import java.util.Hashtable;

import model.ModelData;
@org.springframework.stereotype.Service
public class ServiceLayer {

	Hashtable<String, ModelData> personDetails = new Hashtable<String, ModelData>();

	public ServiceLayer() {
		ModelData md = new ModelData();
		md.setFirstName("Naveen");
		md.setLastName("Seelam");
		md.setAge(28);
		md.setId(232323);
		personDetails.put("1", md);

		md = new ModelData();
		md.setFirstName("Mouni");
		md.setLastName("Seelam");
		md.setAge(25);
		md.setId(231433);
		personDetails.put("2", md);

	}

	public ModelData getModelData(String id) {
		if (personDetails.contains(id)) {
			return personDetails.get(id);
		}

		return null;

	}

	public Hashtable<String, ModelData> getAll() {

		return personDetails;
	}

}
