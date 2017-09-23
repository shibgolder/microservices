/**
 * 
 */
package com.hybris.yaas.giftregistry.converters;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.core.convert.converter.Converter;

import com.hybris.yaas.giftregistry.email.data.EmailAddressData;
import com.hybris.yaas.giftregistry.email.data.EmailData;
import com.hybris.yaas.giftregistry.resources.Email;
import com.hybris.yaas.giftregistry.resources.Emailaddress;

/**
 * @author Shib golder
 *
 */
public class EmailToEmailDataConverter implements Converter<Email, EmailData> {

	@Override
	public EmailData convert(Email source) {

		EmailData  emailData = new EmailData();
		emailData.setToName(source.getToName());
		emailData.setToAddress(source.getToAddress());
		if(source.getTo()!=null && !source.getTo().isEmpty()){
		List<EmailAddressData> to = source.getTo().stream()
												  .map(_toEmailAddressData)
												  .collect(Collectors.<EmailAddressData>toList());
		emailData.setTo(to);
		}
		if(source.getCc()!=null && !source.getCc().isEmpty()){
		List<EmailAddressData> cc = source.getCc().stream()
												  .map(_toEmailAddressData)
												  .collect(Collectors.<EmailAddressData>toList());
		emailData.setCc(cc);
		}
		if(source.getBcc()!=null && !source.getBcc().isEmpty()){
		List<EmailAddressData> bcc = source.getBcc().stream()
												  .map(_toEmailAddressData)
												  .collect(Collectors.<EmailAddressData>toList());
		emailData.setBcc(bcc);
		}
		return emailData;
	}
	
	/**
	 * Convert Emailaddress to EmailAddressData
	 */
	Function<Emailaddress, EmailAddressData> _toEmailAddressData = new Function<Emailaddress, EmailAddressData>() {
		@Override
		public EmailAddressData apply(Emailaddress _t) {
			EmailAddressData _r = new EmailAddressData();
			_r.setName(_t.getName());
			_r.setAddress(_t.getAddress());
			return _r;
		}
	}; 

}
