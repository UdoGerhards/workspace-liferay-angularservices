create table AngularServices_AngularBootstrap (
	bootId LONG not null primary key
);

create table AngularServices_AngularGroup (
	groupId LONG not null primary key
);

create table AngularServices_AngularInstance (
	instanceId LONG not null primary key
);

create table AngularServices_AngularLayout (
	layoutId LONG not null primary key
);

create table AngularServices_AngularOrganization (
	organizationId LONG not null primary key
);

create table AngularServices_AngularPermission (
	permissionId LONG not null primary key
);

create table AngularServices_AngularPortal (
	portalId LONG not null primary key
);

create table AngularServices_AngularResourceBlock (
	resourceBlockId LONG not null primary key
);

create table AngularServices_AngularResourcePermission (
	resourcePermissionId LONG not null primary key
);

create table AngularServices_AngularRole (
	roleId LONG not null primary key
);

create table AngularServices_AngularSite (
	siteId LONG not null primary key
);

create table AngularServices_AngularTeam (
	angularTeamId LONG not null primary key
);

create table AngularServices_AngularUser (
	userId LONG not null primary key
);

create table AngularServices_AngularUserGroup (
	groupId LONG not null primary key
);

create table AngularServices_AngularVirtualHost (
	virtualHostId LONG not null primary key
);

create table AngularServices_AngularVirtualInstance (
	virtualInstanceId LONG not null primary key
);