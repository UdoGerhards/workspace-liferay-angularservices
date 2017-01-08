# workspace-liferay-angularservices
Restful liferay services for angular js

New service builder extension for Liferay. This extension adds more services to the restful service api of Liferay to build modern Javascript webpages with liferay as basis.

The extension is build up to be used with AngularJS. But also other Javascript framework can use the provided services.

Also some new user and resource permissions are shipped with the extension in order to extend the permission system of liferay and to add according permission which are needed for the proper work of the framework.

Provided services are:

- AngularBootstrapService
- AngularGroupService
- AngularInstanceService
- AngularLayoutService
- AngularOrganizationService
- AngularPermissionService
- AngularPortalService
- AngularRessourceBlockService
- AngularRoleService
- AngularSiteService
- AngularTeamService
- AngularUserGroupService
- AngularUserService
- AngularVirtualHostService
- AngularVirtualInstanceService

New action ids are:

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

The extension is still in **alpha state** and will be implemented currently. Therefore **it is far away** to be used in working liferay installation since it is more a **POC at the moment**.
