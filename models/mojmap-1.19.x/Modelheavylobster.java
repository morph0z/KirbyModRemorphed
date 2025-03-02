// Made with Blockbench 4.7.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelheavylobster<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "heavylobster"), "main");
	private final ModelPart bone;
	private final ModelPart bb_main;

	public Modelheavylobster(ModelPart root) {
		this.bone = root.getChild("bone");
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bone = partdefinition.addOrReplaceChild("bone", CubeListBuilder.create(),
				PartPose.offset(-21.0F, 24.0F, 16.0F));

		PartDefinition cube_r1 = bone.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(56, 109)
						.addBox(1.5F, -16.75F, -3.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(18, 109)
						.addBox(4.5F, -16.75F, -3.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, -1.0908F, -0.3491F, 0.0F));

		PartDefinition cube_r2 = bone.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(8, 55)
						.addBox(2.5F, -8.5F, 16.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 113)
						.addBox(1.5F, -8.5F, 13.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(111, 34)
						.addBox(4.5F, -8.5F, 13.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(1.5F, -7.5F, 13.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition cube_r3 = bone.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(109, 0)
						.addBox(1.5F, -16.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 109)
						.addBox(4.5F, -16.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(101, 1)
						.addBox(1.5F, -14.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(8, 100)
						.addBox(4.5F, -14.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(85, 70)
						.addBox(1.5F, -13.0F, 2.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, -0.5236F, -0.3491F, 0.0F));

		PartDefinition cube_r4 = bone.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(78, 21).addBox(0.5F, -19.55F, 12.0F, 6.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, -0.1745F, -0.3491F, 0.0F));

		PartDefinition cube_r5 = bone.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(79, 99)
						.addBox(0.5F, -10.05F, 14.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 71)
						.addBox(0.5F, -9.05F, 14.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(67, 99)
						.addBox(5.5F, -10.05F, 14.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(99, 9)
						.addBox(5.5F, -9.05F, 14.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, 0.4363F, -0.3491F, 0.0F));

		PartDefinition cube_r6 = bone.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(74, 38).addBox(0.5F, -15.05F, 11.5F, 6.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, 0.1309F, -0.3491F, 0.0F));

		PartDefinition cube_r7 = bone.addOrReplaceChild("cube_r7",
				CubeListBuilder.create().texOffs(88, 92)
						.addBox(0.5F, -16.5F, 3.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(59, 31)
						.addBox(-0.5F, -15.5F, 4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 31)
						.addBox(0.5F, -16.5F, 4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(51, 31)
						.addBox(5.5F, -15.5F, 4.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(1.5F, -8.5F, 4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(0.5F, -15.5F, 4.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -18.5F, 0.0F, -0.3491F, 0.0F));

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(66, 52)
						.addBox(8.0F, -2.0F, -8.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-15.0F, -2.0F, -8.0F, 7.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(21, 73)
						.addBox(8.0F, -5.0F, 1.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(-15.0F, -5.0F, 1.0F, 7.0F, 3.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(85, 78)
						.addBox(8.0F, -4.0F, -8.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(71, 73)
						.addBox(-13.0F, -4.0F, -7.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 65)
						.addBox(-15.0F, -4.0F, -8.0F, 7.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 73)
						.addBox(10.0F, -4.0F, -7.0F, 3.0F, 2.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(31, 90)
						.addBox(10.0F, -6.0F, -7.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(87, 7)
						.addBox(-13.0F, -6.0F, -7.0F, 3.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(106, 112)
						.addBox(8.0F, -7.0F, -7.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(112, 97)
						.addBox(13.0F, -7.0F, -7.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(26, 90)
						.addBox(15.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 87)
						.addBox(15.0F, -7.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 4)
						.addBox(15.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(86, 49)
						.addBox(15.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(80, 70)
						.addBox(7.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(68, 87)
						.addBox(7.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(75, 78)
						.addBox(7.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 87)
						.addBox(7.0F, -7.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 78)
						.addBox(-8.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 83)
						.addBox(-8.0F, -7.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(112, 62)
						.addBox(-15.0F, -7.0F, -7.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(36, 83)
						.addBox(-8.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(49, 112)
						.addBox(-10.0F, -7.0F, -7.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(57, 70)
						.addBox(-16.0F, -5.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 82)
						.addBox(-16.0F, -7.0F, -5.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(69, 4)
						.addBox(-16.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(78, 62)
						.addBox(-16.0F, -7.0F, -7.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 4)
						.addBox(-8.0F, -7.0F, -6.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(102, 93)
						.addBox(8.0F, -9.0F, -2.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(111, 15)
						.addBox(8.0F, -9.0F, -5.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 111)
						.addBox(13.0F, -9.0F, -5.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 90)
						.addBox(-13.0F, -13.0F, -7.0F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 110)
						.addBox(-10.0F, -9.0F, -5.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 64)
						.addBox(-15.0F, -9.0F, -2.0F, 7.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(110, 76)
						.addBox(-15.0F, -9.0F, -5.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(96, 57)
						.addBox(10.0F, -8.0F, -7.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(96, 50)
						.addBox(-13.0F, -8.0F, -7.0F, 3.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(86, 70)
						.addBox(-14.0F, -13.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 80)
						.addBox(-14.0F, -13.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(117, 8)
						.addBox(-14.0F, -13.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 117)
						.addBox(9.0F, -9.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(78, 21)
						.addBox(-10.0F, -13.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(98, 116)
						.addBox(13.0F, -9.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 38)
						.addBox(-10.0F, -13.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(90, 116)
						.addBox(-10.0F, -13.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(116, 88)
						.addBox(13.0F, -13.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 31)
						.addBox(13.0F, -13.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 73)
						.addBox(13.0F, -13.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(116, 54)
						.addBox(9.0F, -13.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(63, 73)
						.addBox(9.0F, -13.0F, -3.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 73)
						.addBox(9.0F, -13.0F, -7.0F, 1.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(113, 115)
						.addBox(14.0F, -6.0F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(85, 115)
						.addBox(-15.0F, -6.0F, -10.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 73)
						.addBox(-11.0F, -14.0F, -2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 52)
						.addBox(-11.0F, -14.0F, -22.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(0, 70)
						.addBox(9.0F, -14.0F, -2.0F, 2.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(50, 31)
						.addBox(9.0F, -14.0F, -22.0F, 2.0F, 1.0F, 20.0F, new CubeDeformation(0.0F)).texOffs(57, 18)
						.addBox(-11.0F, -14.0F, -24.0F, 22.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 68)
						.addBox(6.0F, -13.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(114, 27)
						.addBox(-9.0F, -13.0F, -2.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(115, 83)
						.addBox(-8.5F, -12.5F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(77, 115)
						.addBox(6.5F, -12.5F, 0.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-9.0F, -21.0F, -22.0F, 18.0F, 8.0F, 21.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-8.0F, -24.0F, -21.0F, 16.0F, 3.0F, 19.0F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-7.0F, -26.0F, -20.0F, 14.0F, 2.0F, 17.0F, new CubeDeformation(0.0F)).texOffs(51, 29)
						.addBox(-15.0F, -6.0F, -11.0F, 30.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(72, 99)
						.addBox(-10.0F, -20.0F, -8.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(84, 83)
						.addBox(-4.0F, -21.0F, -1.0F, 8.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 115)
						.addBox(3.0F, -21.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(65, 37)
						.addBox(-4.0F, -21.0F, 0.0F, 1.0F, 8.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(51, 45)
						.addBox(-3.0F, -21.0F, 1.0F, 6.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 70)
						.addBox(-3.0F, -21.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(43, 70)
						.addBox(-3.0F, -14.0F, 0.0F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(-4.0F, -21.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(45, 51)
						.addBox(3.0F, -21.0F, 1.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 52)
						.addBox(10.0F, -13.0F, -7.0F, 3.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(60, 99)
						.addBox(9.0F, -20.0F, -8.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(72, 109)
						.addBox(-10.0F, -22.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(62, 109)
						.addBox(8.0F, -22.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(41, 99)
						.addBox(-10.0F, -20.0F, -18.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(102, 119)
						.addBox(-11.0F, -26.5F, -17.25F, 3.0F, 4.0F, 4.25F, new CubeDeformation(0.0F)).texOffs(0, 51)
						.addBox(-10.0F, -30.5F, -15.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(37, 98)
						.addBox(-10.0F, -27.5F, -17.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(12, 43)
						.addBox(-10.0F, -28.5F, -16.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(80, 121)
						.addBox(-10.0F, -26.5F, -23.5F, 1.0F, 1.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(82, 122)
						.addBox(-10.0F, -25.5F, -22.5F, 1.0F, 1.0F, 5.25F, new CubeDeformation(0.0F)).texOffs(86, 124)
						.addBox(-10.0F, -23.5F, -20.5F, 1.0F, 1.0F, 3.25F, new CubeDeformation(0.0F)).texOffs(84, 123)
						.addBox(-10.0F, -24.5F, -21.5F, 1.0F, 1.0F, 4.25F, new CubeDeformation(0.0F)).texOffs(25, 106)
						.addBox(-10.5F, -20.0F, -18.0F, 0.5F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(48, 104)
						.addBox(-10.5F, -17.0F, -18.0F, 0.5F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(32, 90)
						.addBox(-10.5F, -18.0F, -14.0F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 87)
						.addBox(-10.5F, -18.0F, -18.0F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(14, 14)
						.addBox(9.0F, -30.5F, -15.0F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(65, 0)
						.addBox(9.0F, -27.5F, -17.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(86, 124)
						.addBox(9.0F, -23.5F, -20.5F, 1.0F, 1.0F, 3.25F, new CubeDeformation(0.0F)).texOffs(84, 123)
						.addBox(9.0F, -24.5F, -21.5F, 1.0F, 1.0F, 4.25F, new CubeDeformation(0.0F)).texOffs(82, 122)
						.addBox(9.0F, -25.5F, -22.5F, 1.0F, 1.0F, 5.25F, new CubeDeformation(0.0F)).texOffs(80, 121)
						.addBox(9.0F, -26.5F, -23.5F, 1.0F, 1.0F, 6.25F, new CubeDeformation(0.0F)).texOffs(27, 98)
						.addBox(8.0F, -26.5F, -17.25F, 3.0F, 4.0F, 4.25F, new CubeDeformation(0.0F)).texOffs(104, 16)
						.addBox(10.0F, -17.0F, -18.0F, 0.5F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(18, 87)
						.addBox(10.0F, -18.0F, -14.0F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(53, 94)
						.addBox(9.0F, -20.0F, -18.0F, 1.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(0, 104)
						.addBox(10.0F, -20.0F, -18.0F, 0.5F, 2.0F, 5.0F, new CubeDeformation(0.0F)).texOffs(87, 11)
						.addBox(10.0F, -18.0F, -18.0F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(41, 109)
						.addBox(15.0F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(60, 83)
						.addBox(7.0F, -6.0F, 0.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(10, 29)
						.addBox(7.0F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(-8.0F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(74, 45)
						.addBox(-16.0F, -6.0F, 0.0F, 9.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -5.0F, 0.0F, 1.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r8 = bb_main.addOrReplaceChild("cube_r8",
				CubeListBuilder.create().texOffs(107, 70)
						.addBox(5.5F, -15.5F, 4.0F, 2.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 94)
						.addBox(0.5F, -16.5F, 3.0F, 6.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(42, 83)
						.addBox(0.5F, -16.5F, 4.0F, 6.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(45, 52)
						.addBox(5.5F, -15.5F, 4.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(87, 0)
						.addBox(1.5F, -8.5F, 4.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(57, 0)
						.addBox(0.5F, -15.5F, 4.0F, 1.0F, 8.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r9 = bb_main.addOrReplaceChild("cube_r9",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(10.0F, -27.0F, -4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(51, 31)
						.addBox(-9.0F, -27.0F, -4.5F, 1.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition cube_r10 = bb_main.addOrReplaceChild("cube_r10",
				CubeListBuilder.create().texOffs(51, 90)
						.addBox(10.0F, -11.75F, -31.45F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(59, 115)
						.addBox(-9.0F, -11.75F, -31.45F, 1.0F, 6.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, -0.7854F, 0.0F, 0.0F));

		PartDefinition cube_r11 = bb_main.addOrReplaceChild("cube_r11",
				CubeListBuilder.create().texOffs(82, 109)
						.addBox(10.0F, -17.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(30, 113)
						.addBox(10.0F, -19.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(18, 115)
						.addBox(-9.0F, -17.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(69, 115)
						.addBox(-9.0F, -19.0F, -6.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, -1.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r12 = bb_main.addOrReplaceChild("cube_r12",
				CubeListBuilder.create().texOffs(57, 14)
						.addBox(-11.0F, -18.5F, -1.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(10.0F, -17.5F, -1.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(15, 29)
						.addBox(-12.0F, -15.5F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(13, 51)
						.addBox(-5.0F, -20.5F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 62)
						.addBox(-11.0F, -17.5F, -1.75F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(21, 70)
						.addBox(-5.0F, -21.5F, -1.75F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(58, 52)
						.addBox(4.0F, -20.5F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(45, 66)
						.addBox(4.0F, -18.5F, -1.75F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(66, 31)
						.addBox(11.0F, -15.5F, -1.75F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.0436F, 0.0F, 0.0F));

		PartDefinition cube_r13 = bb_main.addOrReplaceChild("cube_r13",
				CubeListBuilder.create().texOffs(66, 52)
						.addBox(-12.0F, -9.0F, -11.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 52)
						.addBox(11.0F, -9.0F, -11.0F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.829F, 0.0F, 0.0F));

		PartDefinition cube_r14 = bb_main.addOrReplaceChild("cube_r14",
				CubeListBuilder.create().texOffs(65, 67)
						.addBox(-3.0F, -14.0F, -5.0F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(20, 72)
						.addBox(-3.0F, -15.0F, -5.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 49)
						.addBox(-3.0F, -16.0F, -5.75F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(73, 50)
						.addBox(-3.0F, -17.0F, -6.25F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(77, 28)
						.addBox(-3.0F, -18.0F, -6.5F, 6.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.3491F, 0.0F, 0.0F));

		PartDefinition cube_r15 = bb_main.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(60, 87)
						.addBox(2.0F, 21.0F, -21.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(74, 87)
						.addBox(-3.0F, 21.0F, -21.0F, 1.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(10, 0)
						.addBox(-2.0F, 21.0F, -21.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(107, 8)
						.addBox(-2.0F, 21.0F, -16.0F, 4.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.5272F, 0.0F, 0.0F));

		PartDefinition cube_r16 = bb_main.addOrReplaceChild("cube_r16",
				CubeListBuilder.create().texOffs(8, 107)
						.addBox(2.0F, -5.0F, -20.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(107, 46)
						.addBox(-3.0F, -5.0F, -20.0F, 1.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(104, 23)
						.addBox(-3.0F, -5.0F, -21.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(100, 39)
						.addBox(-3.0F, -10.0F, -15.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(101, 31)
						.addBox(-3.0F, -10.0F, -22.0F, 6.0F, 6.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-4.0F, -10.0F, -22.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(98, 106)
						.addBox(-3.0F, -5.0F, -16.0F, 6.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 29)
						.addBox(3.0F, -10.0F, -22.0F, 1.0F, 6.0F, 8.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r17 = bb_main.addOrReplaceChild("cube_r17",
				CubeListBuilder.create().texOffs(66, 109)
						.addBox(1.5F, -16.75F, -3.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(76, 109)
						.addBox(4.5F, -16.75F, -3.75F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -1.0908F, 0.3491F, 0.0F));

		PartDefinition cube_r18 = bb_main.addOrReplaceChild("cube_r18",
				CubeListBuilder.create().texOffs(53, 56)
						.addBox(2.5F, -8.5F, 16.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(34, 113)
						.addBox(1.5F, -8.5F, 13.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(113, 42)
						.addBox(4.5F, -8.5F, 13.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(66, 62)
						.addBox(1.5F, -7.5F, 13.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.0F, 0.3491F, 0.0F));

		PartDefinition cube_r19 = bb_main.addOrReplaceChild("cube_r19",
				CubeListBuilder.create().texOffs(109, 85)
						.addBox(1.5F, -16.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(86, 109)
						.addBox(4.5F, -16.0F, 2.0F, 1.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(16, 101)
						.addBox(1.5F, -14.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(101, 86)
						.addBox(4.5F, -14.0F, 2.0F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(1.5F, -13.0F, 2.0F, 4.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.5236F, 0.3491F, 0.0F));

		PartDefinition cube_r20 = bb_main.addOrReplaceChild("cube_r20",
				CubeListBuilder.create().texOffs(0, 80).addBox(0.5F, -19.55F, 12.0F, 6.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, -0.1745F, 0.3491F, 0.0F));

		PartDefinition cube_r21 = bb_main.addOrReplaceChild("cube_r21",
				CubeListBuilder.create().texOffs(113, 49)
						.addBox(0.5F, -10.05F, 14.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(102, 78)
						.addBox(0.5F, -9.05F, 14.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(6, 114)
						.addBox(5.5F, -10.05F, 14.5F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 102)
						.addBox(5.5F, -9.05F, 14.5F, 1.0F, 1.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.4363F, 0.3491F, 0.0F));

		PartDefinition cube_r22 = bb_main.addOrReplaceChild("cube_r22",
				CubeListBuilder.create().texOffs(18, 83).addBox(0.5F, -15.05F, 11.5F, 6.0F, 1.0F, 6.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 0.0F, 0.0F, 0.1309F, 0.3491F, 0.0F));

		PartDefinition cube_r23 = bb_main.addOrReplaceChild("cube_r23",
				CubeListBuilder.create().texOffs(21, 73)
						.addBox(9.5F, -8.25F, -10.5F, 0.5F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(9.5F, -7.5F, -11.5F, 0.5F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 103)
						.addBox(9.5F, -5.75F, -10.75F, 0.5F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(55, 90)
						.addBox(9.5F, -5.75F, -11.75F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(32, 92)
						.addBox(9.5F, -7.25F, -8.5F, 0.5F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(43, 90)
						.addBox(9.5F, -7.25F, -12.25F, 0.5F, 1.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(3, 0)
						.addBox(9.5F, -7.25F, -12.25F, 0.5F, 0.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(0, 1)
						.addBox(13.0F, -7.5F, -11.5F, 0.5F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(57, 90)
						.addBox(13.0F, -7.25F, -12.25F, 0.5F, 1.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(61, 90)
						.addBox(13.0F, -5.75F, -11.75F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(114, 109)
						.addBox(13.0F, -5.75F, -10.75F, 0.5F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 39)
						.addBox(13.0F, -7.25F, -8.5F, 0.5F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(0, 87)
						.addBox(13.0F, -8.25F, -10.5F, 0.5F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(87, 0)
						.addBox(-10.0F, -8.25F, -10.5F, 0.5F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(92, 41)
						.addBox(-10.0F, -7.25F, -8.5F, 0.5F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(115, 2)
						.addBox(-10.0F, -5.75F, -10.75F, 0.5F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 91)
						.addBox(-10.0F, -5.75F, -11.75F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(92, 31)
						.addBox(-10.0F, -7.25F, -12.25F, 0.5F, 1.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(0, 2)
						.addBox(-10.0F, -7.5F, -11.5F, 0.5F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(2, 14)
						.addBox(-13.5F, -7.25F, -12.25F, 0.5F, 0.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(92, 34)
						.addBox(-13.5F, -7.25F, -12.25F, 0.5F, 1.0F, 1.75F, new CubeDeformation(0.0F)).texOffs(43, 93)
						.addBox(-13.5F, -7.25F, -8.5F, 0.5F, 1.0F, 0.75F, new CubeDeformation(0.0F)).texOffs(14, 91)
						.addBox(-13.5F, -5.75F, -11.75F, 0.5F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 115)
						.addBox(-13.5F, -5.75F, -10.75F, 0.5F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(4, 2)
						.addBox(-13.5F, -7.5F, -11.5F, 0.5F, 0.25F, 1.0F, new CubeDeformation(0.0F)).texOffs(87, 7)
						.addBox(-13.5F, -8.25F, -10.5F, 0.5F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.6109F, 0.0F, 0.0F));

		PartDefinition cube_r24 = bb_main.addOrReplaceChild("cube_r24",
				CubeListBuilder.create().texOffs(63, 73)
						.addBox(9.0F, -3.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(42, 91)
						.addBox(13.0F, -3.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(91, 42)
						.addBox(32.0F, -3.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)).texOffs(92, 31)
						.addBox(36.0F, -3.5F, -7.0F, 1.0F, 1.0F, 7.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-23.0F, 0.0F, 0.0F, -0.5672F, 0.0F, 0.0F));

		PartDefinition cube_r25 = bb_main.addOrReplaceChild("cube_r25",
				CubeListBuilder.create().texOffs(32, 106)
						.addBox(-13.0F, -4.75F, -4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(107, 57)
						.addBox(10.0F, -4.75F, -4.0F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5236F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bone.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}