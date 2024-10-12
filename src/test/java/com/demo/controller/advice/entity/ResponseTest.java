package com.demo.controller.advice.entity;

import org.junit.jupiter.api.Test;

import com.openpojo.reflection.PojoClass;
import com.openpojo.reflection.impl.PojoClassFactory;
import com.openpojo.validation.Validator;
import com.openpojo.validation.ValidatorBuilder;
import com.openpojo.validation.rule.impl.GetterMustExistRule;
import com.openpojo.validation.rule.impl.NoPublicFieldsRule;
import com.openpojo.validation.rule.impl.SetterMustExistRule;
import com.openpojo.validation.test.impl.GetterTester;
import com.openpojo.validation.test.impl.SetterTester;

public class ResponseTest {
	
	
		@Test
	    public void testErrorDetailsPojoStructureAndBehavior() {
	        PojoClass pojoClass = PojoClassFactory.getPojoClass(Response.class);

	        Validator validator = ValidatorBuilder.create()
	                .with(new GetterMustExistRule())
	                .with(new SetterMustExistRule())
	                .with(new NoPublicFieldsRule()) 
	                .with(new GetterTester())
	                .with(new SetterTester())
	                .build();

	        // Run the validation
	        validator.validate(pojoClass);
	    }

}
