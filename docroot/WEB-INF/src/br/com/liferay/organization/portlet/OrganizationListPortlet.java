package br.com.liferay.organization.portlet;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.Organization;
import com.liferay.portal.service.OrganizationLocalServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

public class OrganizationListPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest,
			RenderResponse renderResponse) throws IOException, PortletException {

		//OrganizationListPortlet organizations = new OrganizationListPortlet();
		
		// 
		listarOraganizacoes(renderRequest);
		
		super.doView(renderRequest, renderResponse);

	}

	private void listarOraganizacoes(RenderRequest renderRequest) {
		try {
			
			List<Organization> org = OrganizationLocalServiceUtil.getOrganizations(-1, -1);
			ArrayList<Organization> organizations = new ArrayList<Organization>();
		
			
			for (Organization organization : org) {
				organizations.add(organization);
				System.out.println(organization.getAddress().toString());
				
			}
			
			renderRequest.setAttribute("organizations", organizations);
		
		} catch (SystemException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
/*	private ArrayList<Organization> getOrganizations() throws SystemException{
		 
		
		
		
		return organizacoes;
	}*/

}
