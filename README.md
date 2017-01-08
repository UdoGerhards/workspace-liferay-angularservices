# workspace-liferay-angularservices
Restful [Liferay](https://www.liferay.com/) services for angular js!

New service builder extension for Liferay. This extension adds more services to the existing restful service api in order to build modern Javascript webpages with [Liferay](https://www.liferay.com/) as basis.

The extension is build up to be used with AngularJS. But other Javascript framework can use the provided services also.

Also some new user and resource permissions are shipped with the extension in order to extend the permission system of [Liferay](https://www.liferay.com/) and to add according permission which are needed for the proper work of the framework.

The framework is not intended to replace the restful json api of the portal itself but moreover should provide additional convenient services for the work with the portal server.

##Provided services are:

- AngularBootstrapService  
Providing basic system information for angular apps
- AngularGroupService  
Providing services for working with system groups
- AngularInstanceService  
Providing services for working with the server instance
- AngularLayoutService  
Providing services for working with layouts and layout sets
- AngularOrganizationService  
Providing services for working with organizations
- AngularPermissionService  
Providing services for working with permissions
- AngularPortalService  
Providing services for working with the portal itself
- AngularResourceBlockService  
Providing services for working with resource block permissions
- AngularRoleService  
Providing services for working with roles
- AngularSiteService  
Providing services for working with webpages
- AngularTeamService  
Providing services for working with teams
- AngularUserGroupService  
Providing services for working with user groups
- AngularUserService  
Providing services for working with users
- AngularVirtualHostService  
Providing services for working with virtual hosts
- AngularVirtualInstanceService  
Providing servicesfor working with virtual instances

##New action ids are:

- DELETE_USER
- UPDATE_USER
- UPDATE_ORGANIZATION
- DELETE_ORGANIZATION
- UPDATE_ROLE
- DELETE_ROLE
- UPDATE_USER_GROUP
- DELETE_USER_GROUP
- UPDATE_COMMUNITY
- DELETE_COMMUNITY
- ADD_TEAM
- UPDATE_TEAM
- DELETE_TEAM
- LIST_USERS
- LIST_ROLES
- LIST_USER_GROUPS
- LIST_USER_USER_GROUPS
- LIST_ORGANIZATIONS
- LIST_PAGES
- LIST_TEAMS
- LIST_COMPANIES
- LIST_INSTANCES
- ASSIGN_USER_TO_ORGANIZATION
- ASSIGN_USER_TO_ROLE
- ASSIGN_USER_TO_USER_GROUP
- ASSIGN_USER_TO_TEAM
- ASSIGN_USER_TO_PAGE
- ASSIGN_TEAM_TO_PAGE
- ASSIGN_ROLE_TO_PAGE
- ASSIGN_ROLE_TO_ORGANIZATION
- CHECK_PERMISSIONS
- ASSIGN_USER_GROUP_TO_TEAM

##Remark:

The extension is still in **alpha state** and will be implemented currently. Therefore **it is far away** to be used in working [Liferay](https://www.liferay.com/) installations since it is more a **POC at the moment**.

SOAP services are not supported yet but will be added later on with the progress of the project!