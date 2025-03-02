// Made with Blockbench 4.7.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelvoidTermina<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "voidtermina"), "main");
	private final ModelPart rightarm;
	private final ModelPart leftarm;
	private final ModelPart head;
	private final ModelPart torso;
	private final ModelPart waist;
	private final ModelPart leftleg;
	private final ModelPart rightleg;

	public ModelvoidTermina(ModelPart root) {
		this.rightarm = root.getChild("rightarm");
		this.leftarm = root.getChild("leftarm");
		this.head = root.getChild("head");
		this.torso = root.getChild("torso");
		this.waist = root.getChild("waist");
		this.leftleg = root.getChild("leftleg");
		this.rightleg = root.getChild("rightleg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition rightarm = partdefinition.addOrReplaceChild("rightarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rightarm2 = rightarm.addOrReplaceChild("rightarm2", CubeListBuilder.create(),
				PartPose.offset(1.0F, -3.0F, 20.0F));

		PartDefinition cube_r1 = rightarm2.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(42, 27).addBox(-4.0F, -44.0F, -1.0F, 16.0F, 9.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7943F, -0.6188F, -1.1489F));

		PartDefinition rightarm1 = rightarm.addOrReplaceChild("rightarm1", CubeListBuilder.create(),
				PartPose.offset(1.0F, -3.0F, 20.0F));

		PartDefinition cube_r2 = rightarm1.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(48, 122)
						.addBox(6.0F, -24.7F, -12.0F, 6.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(78, 116)
						.addBox(5.0F, -27.7F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(108, 108)
						.addBox(5.0F, -30.7F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(104, 95)
						.addBox(5.0F, -33.7F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 139)
						.addBox(10.0F, -31.2F, -13.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(114, 132)
						.addBox(11.0F, -31.2F, -14.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(126, 133)
						.addBox(11.0F, -25.2F, -14.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(14, 136)
						.addBox(10.0F, -25.2F, -13.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(138, 132)
						.addBox(10.0F, -28.2F, -13.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(49, 133)
						.addBox(11.0F, -28.2F, -14.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(86, 95)
						.addBox(14.0F, -31.7F, -13.5F, 3.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(40, 48)
						.addBox(17.0F, -35.7F, -14.0F, 6.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 35)
						.addBox(12.0F, -34.7F, -13.0F, 16.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0083F, -0.2429F, -2.0329F));

		PartDefinition leftarm = partdefinition.addOrReplaceChild("leftarm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition leftarm2 = leftarm.addOrReplaceChild("leftarm2", CubeListBuilder.create(),
				PartPose.offset(1.0F, -3.0F, 20.0F));

		PartDefinition cube_r3 = leftarm2.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(100, 119)
						.addBox(-11.0F, -33.0F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 16)
						.addBox(-11.0F, -30.0F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(120, 27)
						.addBox(-11.0F, -27.0F, -12.0F, 7.0F, 3.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(125, 46)
						.addBox(-11.0F, -24.0F, -12.0F, 6.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(142, 86)
						.addBox(-11.0F, -24.5F, -13.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(61, 140)
						.addBox(-12.0F, -24.5F, -14.0F, 2.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(88, 86)
						.addBox(-11.0F, -27.5F, -13.0F, 2.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-12.0F, -27.5F, -14.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(142, 16)
						.addBox(-11.0F, -30.5F, -13.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(90, 0)
						.addBox(-12.0F, -30.5F, -14.0F, 2.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(104, 74)
						.addBox(-16.0F, -31.0F, -13.5F, 3.0F, 9.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-22.0F, -35.0F, -14.0F, 6.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(48, 0)
						.addBox(-27.0F, -34.0F, -13.0F, 16.0F, 15.0F, 10.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.0083F, 0.2429F, 2.0329F));

		PartDefinition leftarm1 = leftarm.addOrReplaceChild("leftarm1", CubeListBuilder.create(),
				PartPose.offset(1.0F, -3.0F, 20.0F));

		PartDefinition cube_r4 = leftarm1.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(68, 69).addBox(-13.0F, -43.0F, -1.0F, 16.0F, 9.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.7943F, 0.6188F, 1.1489F));

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(),
				PartPose.offset(0.0F, 23.0F, 0.0F));

		PartDefinition cube_r5 = head.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(126, 87)
						.addBox(-6.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(68, 127)
						.addBox(2.0F, -24.0F, 38.4F, 4.0F, 5.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r6 = head.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(109, 141)
						.addBox(-6.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(141, 141)
						.addBox(2.0F, -48.0F, -0.6F, 4.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(100, 0)
						.addBox(1.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)).texOffs(0, 106)
						.addBox(-7.0F, -49.0F, -9.6F, 6.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r7 = head.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(58, 107)
						.addBox(-7.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(108, 57)
						.addBox(1.0F, -44.0F, 16.4F, 6.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask",
				CubeListBuilder.create().texOffs(0, 35)
						.addBox(-1.0F, -48.0F, 3.4F, 2.0F, 7.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(32, 144)
						.addBox(1.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(120, 38)
						.addBox(2.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(81, 144)
						.addBox(-8.0F, -49.0F, 3.4F, 7.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 127)
						.addBox(-7.0F, -50.0F, 3.4F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(52, 44)
						.addBox(-7.0F, -41.0F, 3.4F, 14.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(76, 65)
						.addBox(-5.0F, -39.0F, 3.4F, 10.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(38, 95)
						.addBox(-3.0F, -38.0F, 3.4F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(82, 32)
						.addBox(-1.0F, -36.0F, 3.4F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 52)
						.addBox(-2.0F, -37.0F, 3.4F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition torso = partdefinition.addOrReplaceChild("torso",
				CubeListBuilder.create().texOffs(100, 41)
						.addBox(-8.0F, -42.0F, 4.7F, 16.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-8.0F, -43.0F, 5.0F, 16.0F, 27.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(24, 122)
						.addBox(-8.0F, -41.0F, 4.2F, 16.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(122, 81)
						.addBox(-8.0F, -41.0F, 4.0F, 16.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r8 = torso.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(20, 145)
						.addBox(7.5F, -31.0F, 5.0F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 3)
						.addBox(9.0F, -34.0F, 5.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(64, 86)
						.addBox(7.0F, -42.0F, 6.0F, 7.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(0, 89)
						.addBox(4.0F, -41.0F, 7.0F, 11.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = torso.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(82, 25).addBox(-13.5F, -39.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, 0.218F, 0.2748F, 0.6848F));

		PartDefinition cube_r10 = torso.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(0, 89).addBox(31.0F, -21.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -0.2519F, 0.2443F, -0.8165F));

		PartDefinition cube_r11 = torso.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(127, 142)
						.addBox(-13.5F, -31.0F, 5.4F, 6.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(40, 0)
						.addBox(-12.0F, -34.0F, 5.4F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(76, 44)
						.addBox(-14.0F, -42.0F, 6.0F, 7.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(36, 78)
						.addBox(-15.0F, -41.0F, 7.0F, 11.0F, 9.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r12 = torso.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(0, 0).addBox(-33.0F, -21.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2519F, -0.2443F, 0.8165F));

		PartDefinition cube_r13 = torso.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(36, 77).addBox(8.0F, -39.0F, 5.0F, 3.0F, 6.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1931F, -0.2926F, -0.5958F));

		PartDefinition cube_r14 = torso
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(92, 17).addBox(-7.0F, -35.0F, 5.0F, 6.0F, 16.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4363F));

		PartDefinition cube_r15 = torso
				.addOrReplaceChild("cube_r15",
						CubeListBuilder.create().texOffs(30, 98).addBox(1.0F, -35.0F, 5.0F, 6.0F, 16.0F, 8.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4363F));

		PartDefinition waist = partdefinition.addOrReplaceChild("waist",
				CubeListBuilder.create().texOffs(142, 27)
						.addBox(-4.0F, -19.0F, 4.0F, 8.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 25)
						.addBox(-3.0F, -20.0F, 4.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(242, 251)
						.addBox(-3.0F, -13.0F, 4.25F, 6.0F, 4.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 7)
						.addBox(-2.0F, -9.0F, 4.25F, 4.0F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 60)
						.addBox(-3.0F, -9.0F, 5.0F, 6.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r16 = waist.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(110, 53)
						.addBox(4.0F, -19.3F, 3.8F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(104, 95)
						.addBox(9.0F, -19.3F, 4.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 131)
						.addBox(4.0F, -16.3F, 3.8F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r17 = waist.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(101, 0)
						.addBox(-10.0F, -19.3F, 4.8F, 1.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(132, 38)
						.addBox(-10.0F, -16.3F, 3.8F, 6.0F, 3.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 102)
						.addBox(-10.0F, -19.3F, 3.8F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition leftleg = partdefinition.addOrReplaceChild("leftleg", CubeListBuilder.create(),
				PartPose.offset(-2.0F, 24.0F, -1.0F));

		PartDefinition leftjoint2 = leftleg.addOrReplaceChild("leftjoint2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r18 = leftjoint2.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(51, 2)
						.addBox(12.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 0)
						.addBox(5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(145, 0)
						.addBox(6.0F, -9.0F, -1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(128, 56)
						.addBox(6.0F, -7.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(130, 9)
						.addBox(6.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(121, 0)
						.addBox(5.0F, -4.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(122, 72)
						.addBox(5.0F, -2.0F, 0.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(64, 48)
						.addBox(5.0F, -2.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(64, 55)
						.addBox(7.0F, -3.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(99, 146)
						.addBox(5.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(112, 16)
						.addBox(8.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(50, 146)
						.addBox(11.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.1309F, 0.0F));

		PartDefinition leftjoint1 = leftleg.addOrReplaceChild("leftjoint1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r19 = leftjoint1.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(0, 148)
						.addBox(5.5F, -15.0F, -4.4F, 7.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(27, 130)
						.addBox(6.0F, -15.0F, -3.4F, 6.0F, 9.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, -0.1309F, 0.0F));

		PartDefinition rightleg = partdefinition.addOrReplaceChild("rightleg", CubeListBuilder.create(),
				PartPose.offset(2.0F, 24.0F, -1.0F));

		PartDefinition rightjoint1 = rightleg.addOrReplaceChild("rightjoint1", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r20 = rightjoint1.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(92, 130).addBox(-12.0F, -15.0F, -3.4F, 6.0F, 9.0F, 5.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.1309F, 0.0F));

		PartDefinition cube_r21 = rightjoint1.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(24, 60).addBox(5.5F, -15.0F, -4.4F, 7.0F, 9.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.7F, 0.0F, 2.4F, -0.5236F, 0.1309F, 0.0F));

		PartDefinition rightjoint2 = rightleg.addOrReplaceChild("rightjoint2", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r22 = rightjoint2.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(130, 100)
						.addBox(-12.0F, -7.0F, 0.0F, 6.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(123, 123)
						.addBox(-13.0F, -2.0F, 0.0F, 8.0F, 2.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(130, 109)
						.addBox(-12.0F, -3.0F, 0.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 68)
						.addBox(-11.0F, -3.0F, -2.0F, 4.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 122)
						.addBox(-13.0F, -4.0F, -1.0F, 8.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(48, 142)
						.addBox(-13.0F, -2.0F, -2.0F, 8.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 95)
						.addBox(-10.0F, -2.0F, -6.0F, 2.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(145, 72)
						.addBox(-13.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(146, 52)
						.addBox(-7.0F, -1.0F, -6.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r23 = rightjoint2.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(6, 35)
						.addBox(12.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 8)
						.addBox(5.0F, -6.0F, -1.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(144, 46)
						.addBox(6.0F, -9.0F, -1.0F, 6.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-17.7F, 0.0F, 2.4F, 0.0F, 0.1309F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		rightarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftarm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		torso.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		waist.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		rightleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}