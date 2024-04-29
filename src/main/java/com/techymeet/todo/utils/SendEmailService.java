package com.techymeet.todo.utils;

import com.techymeet.todo.model.EmailModel;

public interface SendEmailService {

	String sendEmployeeRegisterEmail(String toaddress, String bodyContent, String subject, EmailModel model);

	String sendTaskAssignEmail(String toAddress, String bodyContent, String subjects, EmailModel model);

}
