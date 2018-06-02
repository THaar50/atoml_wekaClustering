package atoml.smoke;

import atoml.data.DataGenerator;

/**
 * Data: Uniformly distributed in [0,1], however, only one instance in class 0, all others in class 1
 * 
 * @author sherbold
 */
public class SingleInstanceMinorityClass extends AbstractSmokeTest {

	/**
	 * creates a new AllZeroes object
	 * 
	 * @param dataGenerator
	 *            data generator that is used
	 */
	public SingleInstanceMinorityClass(DataGenerator dataGenerator) {
		super(dataGenerator);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see atoml.smoke.AbstractSmokeTest#createData()
	 */
	@Override
	public void createData() {
		this.data = dataGenerator.randomUniformData(0, 1);
		data.get(0).setClassValue(0.0d);
		for( int i=0; i<data.size(); i++ ) {
			data.get(i).setClassValue(1.0d);
		}
	}
	
	/*
	 * (non-Javadoc)
	 * 
	 * @see atoml.smoke.AbstractSmokeTest#createTestdata()
	 */
	@Override
	public void createTestdata() {
		this.testdata = this.data;
	}
}