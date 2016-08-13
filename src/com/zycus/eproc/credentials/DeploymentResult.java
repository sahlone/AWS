package com.zycus.eproc.credentials;

import com.amazonaws.services.elasticbeanstalk.model.CreateApplicationResult;
import com.amazonaws.services.elasticbeanstalk.model.DescribeApplicationsResult;

public class DeploymentResult
{

	private String				errorMessage				= null;
	private String				errorCode					= null;
	CreateApplicationResult		createApplicationResult		= null;
	DescribeApplicationsResult	describeApplicationsResult	= null;

	public String getErrorCode()
	{
		return errorCode;
	}

	public void setErrorCode(String errorCode)
	{
		this.errorCode = errorCode;
	}

	public String getErrorMessage()
	{
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage)
	{
		this.errorMessage = errorMessage;
	}

	public CreateApplicationResult getCreateApplicationResult()
	{
		return createApplicationResult;
	}

	public void setCreateApplicationResult(CreateApplicationResult createApplicationResult)
	{
		this.createApplicationResult = createApplicationResult;
	}

	public DescribeApplicationsResult getDescribeApplicationsResult()
	{
		return describeApplicationsResult;
	}

	public void setDescribeApplicationsResult(DescribeApplicationsResult describeApplicationsResult)
	{
		this.describeApplicationsResult = describeApplicationsResult;
	}

}
